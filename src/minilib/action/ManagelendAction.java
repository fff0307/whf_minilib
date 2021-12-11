package minilib.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import minilib.dao.lendmanagement;
import minilib.vo.Title;
import minilib.vo.User;

public class ManagelendAction {
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public String querylend()throws Exception{
		
		String username=user.getUsername();
		HttpServletRequest request = ServletActionContext.getRequest();
		lendmanagement mtmanagement = new lendmanagement();
		List<Title> lendlist=mtmanagement.querylend(username);
		String rest = "querylend";
		request.setAttribute("username", username);
		request.setAttribute("lendlist", lendlist);
		return rest;
		
	}
}
