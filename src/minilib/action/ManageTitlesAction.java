package minilib.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import minilib.dao.titleManagement;
import minilib.vo.Title;
import minilib.vo.User;
import minilib.vo.pagedivide;



public class ManageTitlesAction extends ActionSupport{
	private Title onebook;
	public Title getOnebook() {
		return onebook;
	}
	public void setOnebook(Title onebook) {
		this.onebook = onebook;
	}

	public String addTitle()throws Exception{
		System.out.print("1");
		String restadd = INPUT;	
		titleManagement mtadd = new titleManagement();
		mtadd.saveTitles(onebook);
		restadd = "showadditem";
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("onebook", onebook);
		request.setAttribute("message", "success");
		System.out.print("1");
		return restadd;	
	}
	

	
	
	private String context; 
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String findTitleByname()throws Exception{
		String rest = INPUT;
		titleManagement mtselect = new titleManagement();
		List<Title> selectedTitles = mtselect.findbyname(context);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("selectedlist", selectedTitles);
		if(selectedTitles.size()>0)
		rest = "querybook";
		else
		rest="nofound";
		return rest;
	}
	
	
	public String showallbooks()throws Exception{
		String rest = INPUT;
		titleManagement mtselect = new titleManagement();
		List<Title> allTitles = mtselect.findall();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("allTitles", allTitles);
		if(allTitles.size()>0)
		rest = "allbook";
		return rest;
	
	}
	
	private String Multivariate; 
	public String getMultivariate() {
		return Multivariate;
	}
	public void setMultivariate(String multivariate) {
		Multivariate = multivariate;
	}
	public String findTitleMultivariate()throws Exception{
		String rest = INPUT;
		titleManagement mtselect = new titleManagement();
		List<Title> MultivariateTitles = mtselect.findbyMultivariate(Multivariate);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("MultivariateTitles", MultivariateTitles);
		if(MultivariateTitles.size()>0)
		rest = "Multivariatebooks";
		else
		rest="nofound";
		return rest;
	
	}
	
	
	public String removebooks()throws Exception{
		String rest = INPUT;
		HttpServletRequest request = ServletActionContext.getRequest();
		String removebooktitle=(String)request.getParameter("removebookid");
		System.out.print(removebooktitle);
		titleManagement mtmanagement = new titleManagement();
		int result = mtmanagement.removebooks(removebooktitle);
		System.out.print(result);
		if(result==1)
		rest = "afterremove";
		else
		rest="nofound";
		return rest;
	
	}

	public String dividebooks(){
		String rest = INPUT;
		HttpServletRequest request = ServletActionContext.getRequest();
		titleManagement mtmanagement = new titleManagement();
		int currentPage = 1;
		try {
			currentPage=Integer.parseInt(request.getParameter("curPage"));
			System.out.print(currentPage);
		if(currentPage<=0) {
			currentPage = 1;
		}
		}catch(Exception e) {
			currentPage = 1;
		}
		int pageSize=10;
		int totalData=mtmanagement.bookcount();
		System.out.print(totalData);
		int totalPage=(int)Math.ceil((double)totalData/pageSize);
		if(totalPage<=0)
			totalPage=1;
		if(currentPage>totalPage) {
			currentPage=totalPage;
		}
		List<Title> titles= mtmanagement.findall(currentPage, pageSize);
		pagedivide pg=new pagedivide(currentPage,pageSize,totalData);
		pg.setPageData(titles);
		request.setAttribute("pg", pg);
		rest = "titles";
		return rest;
	
	}
	
	
	
	public String dividebooks2(){
		String rest = INPUT;
		HttpServletRequest request = ServletActionContext.getRequest();
		titleManagement mtmanagement = new titleManagement();
		int currentPage = 1;
		try {
			currentPage=Integer.parseInt(request.getParameter("curPage"));
			System.out.print(currentPage);
		if(currentPage<=0) {
			currentPage = 1;
		}
		}catch(Exception e) {
			currentPage = 1;
		}
		int pageSize=10;
		int totalData=mtmanagement.bookcount();
		System.out.print(totalData);
		int totalPage=(int)Math.ceil((double)totalData/pageSize);
		if(totalPage<=0)
			totalPage=1;
		if(currentPage>totalPage) {
			currentPage=totalPage;
		}
		List<Title> titles= mtmanagement.findall(currentPage, pageSize);
		pagedivide pg=new pagedivide(currentPage,pageSize,totalData);
		pg.setPageData(titles);
		request.setAttribute("pg", pg);
		rest = "removebook";
		return  rest;
	
	}
	
	
	public String actuallyshowbooks()throws Exception{
		String rest = INPUT;
		titleManagement mtselect = new titleManagement();
		List<Title> allTitles = mtselect.findall();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("allTitles", allTitles);
		if(allTitles.size()>0)
		rest = "removebook";
		return rest;
	
	}
	
	
	public String lendbook(){
		String rest = INPUT;
		HttpServletRequest request = ServletActionContext.getRequest();
		titleManagement mtmanagement = new titleManagement();
		int currentPage = 1;
		try {
			currentPage=Integer.parseInt(request.getParameter("curPage"));
			System.out.print(currentPage);
		if(currentPage<=0) {
			currentPage = 1;
		}
		}catch(Exception e) {
			currentPage = 1;
		}
		int pageSize=10;
		int totalData=mtmanagement.bookcount();
		System.out.print(totalData);
		int totalPage=(int)Math.ceil((double)totalData/pageSize);
		if(totalPage<=0)
			totalPage=1;
		if(currentPage>totalPage) {
			currentPage=totalPage;
		}
		List<Title> titles= mtmanagement.findall(currentPage, pageSize);
		pagedivide pg=new pagedivide(currentPage,pageSize,totalData);
		pg.setPageData(titles);
		request.setAttribute("pg", pg);
		rest = "lendbook";
		return  rest;
	
	}
	
	public String lendbooklink() {
		
		String rest = INPUT;
		HttpServletRequest request = ServletActionContext.getRequest();
		String lendbookid=(String)request.getParameter("lendbookid");
		System.out.print(lendbookid);
		titleManagement mtmanagement = new titleManagement();
		Title lendbook = mtmanagement.findbyid(lendbookid);
		java.util.Date currentTime = new java.util.Date();
		String current_time=currentTime.toString(); //??????????????????
		int result = mtmanagement.insertlend_return(lendbook.getIsbn(),lendbook.getTitle(),lendbook.getAuthors(),current_time);
		mtmanagement.insertlendlist(lendbook.getIsbn(),lendbook.getTitle(),lendbook.getAuthors(),current_time);
		List<Title> lendlist= mtmanagement.showlend();
		rest = "showlendbook";
		request.setAttribute("lendlist", lendlist);
		return rest;
	}
	
	
	public String returnbook(){
		String rest = INPUT;
		HttpServletRequest request = ServletActionContext.getRequest();
		titleManagement mtmanagement = new titleManagement();
		List<Title> lendlist= mtmanagement.showlend();
		rest = "returnbook";
		request.setAttribute("returnbook", lendlist);
		return  rest;
	
	}
	
	public String returnbooklink(){
		String rest = INPUT;
		HttpServletRequest request = ServletActionContext.getRequest();
		String returnbookid=(String)request.getParameter("returnbookid");
		System.out.print(returnbookid);
		titleManagement mtmanagement = new titleManagement();
		int result = mtmanagement.deletereturnbook(returnbookid);
		rest = "showlendbook";
		List<Title> lendlist= mtmanagement.showlend();
		request.setAttribute("lendlist", lendlist);
		return rest;
	
	}
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String useridentity() {
		if(user.getUsername().equals("1")&&user.getPassword().equals("1"))
			return "manager";
		else
			return "notmanager";
	}
	public String useridentity2() {
		if(user.getUsername().equals("1")&&user.getPassword().equals("1"))
			return "manager2";
		else
			return "notmanager2";
	}
}
