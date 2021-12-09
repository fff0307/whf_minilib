package minilib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import minilib.util.DBUtil;
import minilib.vo.Title;

public class titleManagement {
	public void saveTitles(Title book) {
		try{
			Connection conn = DBUtil.connectDB();
			String sql = "insert into book_table(isbn,title,authors,pressid) value(?,?,?,?)";
			System.out.println("sql"+sql+ book.getIsbn()+book.getTitle()
			+book.getAuthors()+book.getPressid());
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthors());
			pstmt.setString(4, book.getPressid());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch(Exception e){
		
		}
			
	}
	
	public List findbyname(String name)
	{
		List list = new ArrayList();
		try{
			String sql="";
			Connection conn = DBUtil.connectDB();
			sql = "select * from book_table where title='"+name+"'";
			System.out.println("sql"+sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rst = pstmt.executeQuery();			
			while(rst.next()){
				Title title = new Title();			
				title.setIsbn(rst.getString(1));
				title.setTitle(rst.getString(2));
				title.setAuthors(rst.getString(3));
				title.setPressid(rst.getString(4));					
				list.add(title);
			}
		rst.close();
		pstmt.close();
		conn.close();
		}catch(Exception e){
			
		}
		return list;
	}
	
	
	
	public List findall()
	{
		List list = new ArrayList();
		try{
			String sql="";
			Connection conn = DBUtil.connectDB();
			sql = "select * from book_table";
			System.out.println("sql"+sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rst = pstmt.executeQuery();			
			while(rst.next()){
				Title title = new Title();			
				title.setIsbn(rst.getString(1));
				title.setTitle(rst.getString(2));
				title.setAuthors(rst.getString(3));
				title.setPressid(rst.getString(4));					
				list.add(title);
			}
		rst.close();
		pstmt.close();
		conn.close();
		}catch(Exception e){
			
		}
		return list;
	}
	
	public List findbyMultivariate(String Multivariate)
	{
		List list = new ArrayList();
		try{
			Connection conn = DBUtil.connectDB();
			String strsql = "select ";
			strsql = strsql + "isbn,title,authors,pressid";
			strsql = strsql + " from book_table where ";
			strsql = strsql + "  isbn like '%" +Multivariate+ "%'" ;
			strsql = strsql + " or title like '%" +Multivariate+ "%'" ;
			strsql = strsql + " or authors like '%" +Multivariate+ "%'" ;
			strsql = strsql + " or pressid like '%" +Multivariate+ "%'" ;
			
			System.out.println("sql"+strsql);
			PreparedStatement pstmt = conn.prepareStatement(strsql);
			ResultSet rst = pstmt.executeQuery();			
			while(rst.next()){
				Title title = new Title();			
				title.setIsbn(rst.getString(1));
				title.setTitle(rst.getString(2));
				title.setAuthors(rst.getString(3));
				title.setPressid(rst.getString(4));					
				list.add(title);
			}
		rst.close();
		pstmt.close();
		conn.close();
		}catch(Exception e){
			
		}
		return list;
	}
	
	
	public int removebooks(String removebookid){
		Connection con=DBUtil.connectDB();
		try {
			Statement  st=con.createStatement();
			int ok = st.executeUpdate("delete from book_table where isbn ='"+removebookid+"'");			
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
