package minilib.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	
	
}
