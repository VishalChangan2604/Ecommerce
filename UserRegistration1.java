package comp.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//2.	User is able to register first then buy the product. 

public class UserRegistration1 {
	PreparedStatement prs=null;
	Connection con=null;
	
	public void userInput(String username,String passcode ) {
		UserRegisterConnection urc=new UserRegisterConnection();
		try {
			//con=urc.connectionRegister();
			 con=(Connection) urc.connectionRegister();//connection built up
			 prs=con.prepareStatement("insert into UserDetails(User_id,User_passcode) values(?,?)");
			 prs.setString(1,username );
			 prs.setString(2, passcode);
			 int i=prs.executeUpdate();
			 System.out.println("Record Inserted successfully" +i);
			 System.out.println();
			
		} catch (Exception e) {
						e.printStackTrace();
		}
		
		
	}
	
	
	//
	public void buyProduct() {
		UserRegisterConnection urc1=new UserRegisterConnection();
		Statement prs=null;
		try {
			con=urc1.connectionRegister();
			prs=con.prepareStatement("select * from UserDetails");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	//
	
	
	public static void main(String[] args) {
		UserRegistration1 us1=new UserRegistration1();
		Scanner scan=new Scanner(System.in);
		for(int a=1;a<=1;a++) {
			
			
		System.out.println("Enter the username");
		String username=scan.next();
		
		System.out.println("Enter the passcode");
		String passcode=scan.next();
		us1.userInput(username, passcode);
		
		}
		
	}
	
	
	

}
