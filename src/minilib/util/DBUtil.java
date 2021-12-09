package minilib.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class DBUtil {
	private static String JSDBDriver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/librarymanagement?useUnicode=true&characterEncoding=utf-8";
	private static String username="root";
	private static String password="whf0213521521";
	private static Connection con;
	
	
	public static Connection connectDB() {
		try {
			Class.forName(JSDBDriver);
			con=DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			System.out.print("连接服务器失败");
		}
		
		return con;
	}


	
}