package minilib.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
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
	
	public int insertintouser_table(String userid,String username,String password){
		con=DBUtil.connectDB();
		try{
			pst=con.prepareStatement("insert into user_table values(?,?,?)");
			pst.setString(1,userid);
			pst.setString(2,username);
			pst.setString(3,password);
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
		
		
		
}
