package minilib.vo;

import java.io.Serializable;

public class User{
	private String userid;
	private String username;
	private String password;
	private String usersex;
	public String getUsersex() {
		return usersex;
	}
	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}
	public String getUserphonenumber() {
		return userphonenumber;
	}
	public void setUserphonenumber(String userphonenumber) {
		this.userphonenumber = userphonenumber;
	}
	private String userphonenumber;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserid() {
		
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
