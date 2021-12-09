package minilib.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import minilib.dao.userManagement;
import minilib.vo.User;

public class registerAction  extends ActionSupport{
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() throws Exception {
		System.out.print("yiji ");
		String username=user.getUsername();
		String password=user.getPassword();
		String userid =user.getUserid();
		System.out.print(userid);
		userManagement users=new userManagement();
		int result=users.insertintouser_table(userid,username,password);
		HttpServletRequest request= ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		session.setAttribute("username", user.getUsername());
		if(result==1)
        return "success";
        
	
	else
	return "error";
	

}
}
