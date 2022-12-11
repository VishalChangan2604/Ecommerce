package comp.test;
//7.	Admin should able to check the quantity of each product by using the product id.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminShopDetails3 {
	public static void main(String[] args) {
		PreparedStatement prs=null;
		Connection con=null;
		UserRegisterConnection urc=new UserRegisterConnection();
		try {
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the product id");
			int id=scan.nextInt();
			
			con=urc.connectionRegister();
			prs=con.prepareStatement("select * from Product where pro_id="+id);
			ResultSet rs=prs.executeQuery();
			System.out.println("AVAILABLE PRODUCT QUANTITY BY PRODUCT ID :");
			
			while(rs.next()) {
				
				System.out.println("\nProduct_Name :"+rs.getString(4));
				System.out.println("Product_Quantity :"+rs.getString(5));
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
