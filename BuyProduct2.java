package comp.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuyProduct2 {
	
	 
	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement prs=null;
		
		UserRegisterConnection urc=new UserRegisterConnection();
		try {
			con=urc.connectionRegister();
			//4.	User should able to see the product list into ascending order. 
			prs=con.prepareStatement("select * from Product ");
			
			prs=con.prepareStatement("select * from Product order by pro_id ");
			//SELECT * FROM student WHERE city = 'pune' ORDER BY salary;
			
			ResultSet rs=prs.executeQuery();
			System.out.println("SELECT THE PRODUCT FROM LIST:");	
			while(rs.next()) {
				
			System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+(rs.getString(3) +" "+rs.getString(4)+" "+rs.getString(5)));
			
			
			
			}
			System.out.println("\nASCENDING ORDER BY NAME");
			prs=con.prepareStatement("select * from Product order by prod_name ");
			
			ResultSet rs1=prs.executeQuery();
			while(rs1.next()) {
								System.out.println(rs1.getString(4));
					}
							} catch (SQLException e) {
			
			e.printStackTrace();
		}
		BuyProduct2 bp=new BuyProduct2();
		bp.buyProduct();
		System.out.println("Total Bill" );
		
for(int j=1;j<=3;j++) {
		Scanner scan1=new Scanner (System.in);
		
		String product=scan1.next();
		
		//System.out.println(product);
}
		

		
		
	}
	public void buyProduct() {
		Connection con1=null;
		PreparedStatement prs1=null;
		UserRegisterConnection urc1=new UserRegisterConnection();

		
		try {
			for(int k=1;k<=3;k++) {
			System.out.println("\nENTER PRODUCT TO BUY");//1
			Scanner scan =new Scanner(System.in);
			String name=scan.next();//num id
			con1=urc1.connectionRegister();
			prs1=con1.prepareStatement("select * from Product where prod_name='"+name+"'");
			ResultSet rs1=prs1.executeQuery();
			while(rs1.next()) {
				System.out.println("Product name: "+rs1.getString(4));
				
				System.out.println("Product Price :"+rs1.getString(3));
			
			}
			
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
