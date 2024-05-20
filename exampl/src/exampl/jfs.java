package exampl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class jfs {

	public static final String Driver = "com.mysql.cj.jdbc.Driver";
	public static final String Username = "root";
	public static final String Password = "root";
	public static final String Url = "jdbc:mysql://localhost:3306/";
	public static Connection conn;
	public static PreparedStatement pmst;
	public static void main(String[] args) {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(Driver);
			conn = DriverManager.getConnection(Url, Username, Password);
			System.out.println("Enter database name");
			String sql = "drop database "+ src.next();
			pmst = conn.prepareStatement(sql);
			int i = pmst.executeUpdate();
			if(i==0) {
				System.out.println("Successfully deleted");
			}
			else {
				System.out.println("Error");
			}
			pmst.close();
			conn.close();
			src.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
