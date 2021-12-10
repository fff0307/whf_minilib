package minilib.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;







//import com.mysql.jdbc.Connection;

import java.sql.Connection;

import minilib.util.DBUtil;
import minilib.vo.Title;
import minilib.vo.User;


public class userManagement {
	private Connection con;
	private User user;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;

	public userManagement() {
		con=DBUtil.connectDB();
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public int insertintouser_table(String userid,String username,String password,String usersex,String userphonenumber){
		con=DBUtil.connectDB();
		try{
			pst=con.prepareStatement("insert into user_table values(?,?,?,?,?)");
			pst.setString(1,userid);
			pst.setString(2,username);
			pst.setString(3,password);
			pst.setString(4,usersex);
			pst.setString(5,userphonenumber);
			if(pst.executeUpdate()==1) {
				con.close();
				return 1;
			}
			else {
				con.close();
				return 0;
			}
		}catch(SQLException e){
			e.getMessage();
			System.out.print(e.getMessage());
			return 0;
		}
		}
	
	public String checklogin(String username,String password){
		con=DBUtil.connectDB();
		try{
			Title title = new Title();
			String sql="";
			Connection conn = DBUtil.connectDB();
			sql = "select * from user_table where username='"+username+"' and password = '"+password+"'";
			System.out.println("sql"+sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rst = pstmt.executeQuery();			
			if(!rst.next()) {
				return "none";
			}
			else
				return "success";
			
		}catch(SQLException e){
			e.getMessage();
			System.out.print(e.getMessage());
			
		}
		return "0";
	}
	public User selectbyid_user(String userid){
		con=DBUtil.connectDB();
		User user = new User();
		try{
			
			String sql="";
			Connection conn = DBUtil.connectDB();
			sql = "select * from user_table where userid='"+userid+"'";
			System.out.println("sql"+sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rst = pstmt.executeQuery();			
			if(rst.next()) {
				user.setUserid(rst.getString(1));
				user.setUsername(rst.getString(2));
				user.setPassword(rst.getString(3));
				user.setUsersex(rst.getString(4));
				user.setUserphonenumber(rst.getString(5));
				System.out.print(user.getPassword());
			}
			
			
		}catch(SQLException e){
			e.getMessage();
			System.out.print(e.getMessage());
			
		}
		return user;
	}
	public List findall()
	{
		List users = new ArrayList();
		try{
			String sql="";
			Connection conn = DBUtil.connectDB();
			sql = "select * from user_table";
			System.out.println("sql"+sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rst = pstmt.executeQuery();			
			while(rst.next()){
				User user = new User();			
				user.setUserid(rst.getString(1));
				user.setUsername(rst.getString(2));
				user.setPassword(rst.getString(3));
				user.setUsersex(rst.getString(4));	
				user.setUserphonenumber(rst.getString(5));	
				users.add(user);
			}
		rst.close();
		pstmt.close();
		conn.close();
		}catch(Exception e){
			
		}
		return users;
	}	
	
	
	public int removeuser(String removeuserid){
		Connection con=DBUtil.connectDB();
		try {
			Statement  st=con.createStatement();
			int ok = st.executeUpdate("delete from user_table where userid ='"+removeuserid+"'");			
			if(ok==1) {
				con.close();
				return 1;
			}else {
				con.close();
				return 0;
			}
		}catch(SQLException e)
		{
			
			System.out.print(e.getMessage());
			return 0;
		}
		
		}
}
