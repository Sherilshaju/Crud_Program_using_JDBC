package Usermanagement;

import java.sql.SQLException;
import java.util.Scanner;
public class Main {

		public static void main(String[] args)throws ClassNotFoundException,SQLException {
			
			
			//private void choice()throws ClassNotFoundException, SQLException{
				
				// TODO Auto-generated method stub
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the Choice:\n1.Admin\n2.Student");
				int n=s.nextInt();
				if(n==1)
				{
					Insertadmin obj=new Insertadmin();
					obj.Admin();
				}
				else if(n==2)
				{
					Insertstud obj1=new Insertstud();
					obj1.Stud();
				}
				else
				{
					System.out.println("Invalid Input");
				}
	}

}
