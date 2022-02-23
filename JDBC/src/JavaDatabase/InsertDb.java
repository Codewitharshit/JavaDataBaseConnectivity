package JavaDatabase;
import java.sql.*;
public class InsertDb {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///Harshit", "root", "root@12345");
			String query = "INSERT INTO NEWBASE VALUES(101,'HARSHIT','Panchkula'),(102,'Rohit','Chandigarh');";
			Statement st = con.createStatement();
		   int i=	st.executeUpdate(query);
		   if(i>0) {
			   System.out.println("Record is inserted");
		   }
		   else {
			   System.out.println("Record is not inserted");
		   }

		} catch (Exception e) {

			System.out.println("Exception has occured" + e);
		}

	}

}
