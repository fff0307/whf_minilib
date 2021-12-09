package minilib.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import minilib.dao.userManagement;
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
}
