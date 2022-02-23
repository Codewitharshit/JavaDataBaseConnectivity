package JavaDatabase;

import java.sql.*;

public class JavaDbConnectDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///Harshit", "root", "root@12345");
			String query = "CREATE TABLE NEWBASE(ID INT,NAME VARCHAR(30),ADRESS VARCHAR(30));";
			Statement st = con.createStatement();
			st.executeUpdate(query);

		} catch (Exception e) {

			System.out.println("Exception has occured" + e);
		}

	}

}
