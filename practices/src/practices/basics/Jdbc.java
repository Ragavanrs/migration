package practices.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dburl="jdbc:mysql://localhost:3306/sakila";
		String username="root";
		String password="123456";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(dburl,username,password);
			System.out.println("connection established");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs =stmt.executeQuery("select * from city");
			
			System.out.println(rs);
			 while(rs.next())  
			 {   System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			        
			    }
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
