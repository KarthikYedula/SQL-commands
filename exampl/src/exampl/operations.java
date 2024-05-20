package exampl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class operations {
	public static final String Driver = "com.mysql.cj.jdbc.Driver";
	public static final String Username = "root";
	public static final String Password = "root";
	public static Connection conn;
	public static PreparedStatement pmst;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			display();
			System.out.println("Enter choice");
			ch = Integer.parseInt(sc.nextLine());

			switch (ch) {
			case 1:
				createdatabase();
				break;
			case 2:
				createtable();
				break;
			case 3:
				insertion();
				break;
			case 4:
				deletion();
				break;
			case 5:
				getall();
				break;
			case 6:
				getbyid();
				break;
			case 7:
				droptable();
				break;
			case 8:
				dropdatabase();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
			}

		} while (ch > 0);
	}

	private static void dropdatabase() {
		String url = "jdbc:mysql://localhost:3306/";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(url, Username, Password);
			System.out.println("Enter Database Name");
			String sql ="drop database "+sc.next();
			pmst = conn.prepareStatement(sql);
			int i = pmst.executeUpdate();
			if(i==0) {
				System.out.println("database dropped");
			}
			else {
				System.out.println("Error");
			}
//			pmst.close();
//			sc.close();
//			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	private static void droptable() {
		System.out.println("jhkfd");

	}

	private static void getbyid() {
		System.out.println("jhkr");

	}

	private static void getall() {
		System.out.println("jhkw");

	}

	private static void deletion() {
		System.out.println("jhkq");

	}

	private static void insertion() {
		System.out.println("jhkkl");
	}

	private static void createtable() {
		System.out.println("jhkdf");

	}

	private static void createdatabase() {
		String url = "jdbc:mysql://localhost:3306/";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(url, Username, Password);
			System.out.println("Enter Database Name");
			String sql ="create database "+sc.next();
			pmst = conn.prepareStatement(sql);
			int i = pmst.executeUpdate();
			if(i>0) {
				System.out.println("database created");
			}
			else {
				System.out.println("Error");
			}
//			pmst.close();
//			sc.close();
//			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void display() {
		System.out.println("Operations");
		System.out.println("\t1 .create database");
		System.out.println("\t2 .create table");
		System.out.println("\t3 .insertion of data");
		System.out.println("\t4 .deletion of data");
		System.out.println("\t5 .fetch all records");
		System.out.println("\t6 .get record by id");
		System.out.println("\t7 .deletion of table");
		System.out.println("\t8 .deletion of database");
		System.out.println("\t9 .Terminate process");






	}

}
