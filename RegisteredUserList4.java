package comp.test;
//8.	Ability to display the entire registered user list. 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RegisteredUserList4 {
	
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement prs=null;
		UserRegisterConnection urc=new UserRegisterConnection();
		Scanner scan=new Scanner(System.in);
		System.out.println("Display Entire registered list By Costomer Name :\n");
		//String list=scan.next();
		try {
			con=urc.connectionRegister();
			prs=con.prepareStatement("select * from userdetails order by User_id ");
			ResultSet rs=prs.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
