package minilib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

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
	
	public Title findbyid(String lendid)
	{
		Title title = new Title();
		try{
			String sql="";
			Connection conn = DBUtil.connectDB();
			sql = "select * from book_table where isbn='"+lendid+"'";
			System.out.println("sql"+sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rst = pstmt.executeQuery();			
			if(rst.next()){		
				title.setIsbn(rst.getString(1));
				title.setTitle(rst.getString(2));
				title.setAuthors(rst.getString(3));
				title.setPressid(rst.getString(4));					
			}
		rst.close();
		pstmt.close();
		conn.close();
		}catch(Exception e){
			
		}
		return title;
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
	
	/*分页查询*/
	public List<Title> findall(int currentPage,int pageSize ){
		List<Title> list = new ArrayList();
		try{
			String sql="";
			Connection conn = DBUtil.connectDB();
			//select from table limit (页码-1)*每页条数 ， 每页条数
			sql = "select * from book_table limit ?,?";
			System.out.println("sql"+sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (currentPage-1)*pageSize);
			pstmt.setInt(2, pageSize);
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
	
	
	/*查询书目数据表中共有多少条记录*/
	public int bookcount(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select count(isbn) from book_table";
		int total = 0;
		try {
		conn = DBUtil.connectDB();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()){
		total = rs.getInt(1);
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return total;

		}
	
	public int insertlend_return(String isbn,String title,String authors,String lendtime) {
		int result = 0;
		try{
			Connection conn = DBUtil.connectDB();
			HttpServletRequest request= ServletActionContext.getRequest();
			HttpSession session=request.getSession();
			String username = (String)session.getAttribute("username");
			String sql = "insert into lend_return(isbn,title,author,lendtime,readername) value(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, isbn);
			pstmt.setString(2, title);
			pstmt.setString(3, authors);
			pstmt.setString(4, lendtime);
			pstmt.setString(5, username);
			 result= pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch(SQLException e){
			System.out.print(e.getMessage());
		}
		return result;
	}
	
	
	public int insertlendlist(String isbn,String title,String authors,String lendtime) {
		int result = 0;
		try{
			Connection conn = DBUtil.connectDB();
			HttpServletRequest request= ServletActionContext.getRequest();
			HttpSession session=request.getSession();
			String username = (String)session.getAttribute("username");
			String sql = "insert into managelend(isbn,title,authors,lendtime,readername) value(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, isbn);
			pstmt.setString(2, title);
			pstmt.setString(3, authors);
			pstmt.setString(4, lendtime);
			pstmt.setString(5, username);
			 result= pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch(SQLException e){
			System.out.print(e.getMessage());
		}
		return result;
	}
	
	
	
	public List showlend()
	{
		List list = new ArrayList();
		try{
			String sql="";
			Connection conn = DBUtil.connectDB();
			sql = "select * from lend_return";
			System.out.println("sql"+sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rst = pstmt.executeQuery();			
			while(rst.next()){
				Title title = new Title();			
				title.setIsbn(rst.getString(1));
				title.setTitle(rst.getString(2));
				title.setAuthors(rst.getString(3));
				title.setLendtime(rst.getString(4));					
				list.add(title);
			}
		rst.close();
		pstmt.close();
		conn.close();
		}catch(Exception e){
			
		}
		return list;
	}
	
	
	
	
	public int deletereturnbook(String removebookid){
		Connection con=DBUtil.connectDB();
		try {
			Statement  st=con.createStatement();
			int ok = st.executeUpdate("delete from lend_return where isbn ='"+removebookid+"'");			
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
