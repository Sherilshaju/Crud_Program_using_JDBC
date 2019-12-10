package crud;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		
		
		//private void choice()throws ClassNotFoundException, SQLException{
			
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n;
            do
            {
			System.out.println("1.Insert\n2.View\n3.Update\n4.Delete\n5.Login\n6.Exit");
			 n=s.nextInt();
			Insert obj1=new Insert();
			switch(n)
			{
			case 1:
				Insert insert=new Insert();
				insert.insertdata();
				break;
			case 2:
				View view=new View();
				view.viewdata();
				break;
			case 3:
				Update update=new Update();
				update.updatedata();
				break;
			case 4:
				Delete delete=new Delete();
				delete.deletedata();
				break;
			case 5:
				Login log=new Login();
				log.logindata();
			case 6:	
				System.exit(0);
			}
		
		}while(n!=0);
	}

	

	}

	


