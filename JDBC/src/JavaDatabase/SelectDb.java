package JavaDatabase;
import java.sql.*;
public class SelectDb {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///Harshit", "root", "root@12345");
			String query = "SELECT*FROM NEWBASE";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Id="+rs.getInt("ID")+",NAME ="+rs.getString("NAME")+",ADDRESS="+rs.getString("ADRESS"));
			}
			   
		} catch (Exception e) {

			System.out.println("Exception has occured" + e);
		}

	}

}
