package minilib.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import minilib.dao.titleManagement;
import minilib.dao.userManagement;
import minilib.vo.Title;
import minilib.vo.User;
public class usermanageAction extends ActionSupport{
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	public String query(){
		System.out.print("1");
		String userid= user.getUserid();
		userManagement usermanage = new userManagement();
		User user=usermanage.selectbyid_user(userid);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("user", user);
		return "success";
	}
	
	
	
	public String add() {
		String username=user.getUsername();
		String password=user.getPassword();
		String userid =user.getUserid();
		String usersex=user.getUsersex();
		String userphonenumber=user.getUserphonenumber();
		System.out.print(userid);
		userManagement users=new userManagement();
		int result=users.insertintouser_table(userid,username,password,usersex,userphonenumber);
		HttpServletRequest request= ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		session.setAttribute("username", user.getUsername());
		if(result==1)
        return "successadd";
		else
			return "erroradd";
	

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
			return "notmanager";
	}
	
	public String useridentity3() {
		if(user.getUsername().equals("1")&&user.getPassword().equals("1"))
			return "manager3";
		else
			return "notmanager";
	}
	public String showallusers()throws Exception{
		String rest = INPUT;
		userManagement mtselect = new userManagement();
		List<User> allUsers = mtselect.findall();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("allUsers", allUsers);
		if(allUsers.size()>0)
		rest = "allUsers";
		return rest;
	
	}
	public String removeuser()throws Exception{
		String rest = INPUT;
		HttpServletRequest request = ServletActionContext.getRequest();
		String removeuserid=(String)request.getParameter("removeuserid");
		System.out.print(removeuserid);
		userManagement usermanagement = new userManagement();
		int result = usermanagement.removeuser(removeuserid);
		System.out.print(result);
		if(result==1)
		rest = "manager3";
		else
		rest="nofound";
		return rest;
	
	}
	
}
