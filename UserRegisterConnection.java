package comp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserRegisterConnection {
	Connection connection=null;
	
	public Connection  connectionRegister() throws SQLException {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//driver set
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Root");
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		
		return connection;
		
	}
}
