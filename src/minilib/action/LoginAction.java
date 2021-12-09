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

public class LoginAction extends ActionSupport{
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() throws Exception {
			String username=user.getUsername();
			String password=user.getPassword();
			userManagement users=new userManagement();
			String result=users.checklogin(username,password);
			HttpServletRequest request= ServletActionContext.getRequest();
			HttpSession session=request.getSession();
			session.setAttribute("username", user.getUsername());
			if(result.equals("none"))
            return "error";
            
		
		else
		return "success";
		

	}
	

}
	
	
	

