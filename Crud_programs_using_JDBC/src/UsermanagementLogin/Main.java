package UsermanagementLogin;

import java.sql.SQLException;
import java.util.Scanner;

import crud.Login;



public class Main {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Choice:\n1.Insert\n2.Login\n3.Exit");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			Insert obj1=new Insert();
			obj1.insert();
		case 2:
			Login obj2=new Login();
			obj2.login();
		case 3:
			System.exit(0);
		}
	}

}
