package minilib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import minilib.util.DBUtil;
import minilib.vo.Title;

public class lendmanagement {
	public List querylend(String name)
	{
		List list = new ArrayList();
		try{
			String sql="";
			Connection conn = DBUtil.connectDB();
			sql = "select * from managelend where readername='"+name+"'";
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
}
