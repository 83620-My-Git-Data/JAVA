
import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int total=0;
		int dosa,samosa,idli;
		Scanner sc = new Scanner(System.in);
		dosa=50;
		samosa=20;
		idli=25;
		
		
		do
		{	
			System.out.println("The food choices are ");
			System.out.println("0. Exit ");
			System.out.println("1. Dosa for Rs.50 ");
			System.out.println("2. Samosa for Rs.20 ");
			System.out.println("3. Idli for Rs.25 ");
			System.out.println("4. Generate Bill");
			
			System.out.println("Enter your choice ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("dosa purchased ");
				total=total+dosa;
				break;
			case 2:
				System.out.println("Samosa purchased ");
				total=total+samosa;
				break;
			case 3:
				System.out.println("Idli purchased ");
				total=total+idli;
				break;
			case 4:
				System.out.println("The total bill is " +total);
				break;
				default:
					System.out.println("Invalid choice ");
			}
		}while( choice!=0 );

	}

}