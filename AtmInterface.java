import java.util.* ;

public class AtmInterface
{
	public static void main(String [] array) 
	{
		Scanner sc = new Scanner(System.in);
		int yes = 1;
		
		do
		{
			int pin = 1234 ;
			int balance = 100000 ;
			int depositAmount = 0 ;
			int withdrawAmount = 0 ;
			String userName ;
		
			System.out.println("Enter your pin number :  ") ;
			int userPin = sc.nextInt() ;
		
			if(userPin == pin)
			{
				System.out.println("Enter your name :  ") ;
				userName = sc.next() ;
				System.out.println("Welcome " + userName) ;
				while(true)
				{
					System.out.println("1 : Check your balance\n2 : Deposit Amount\n3 : Withdraw Amount\n4 : Get Receipt\n5 : Exit\nEnter your choice  :   ") ;
					int Choice = sc.nextInt() ;
				    switch(Choice)
					{
						case 1 :
							System.out.println("Your balance :" + balance);
							break ;
						case 2 :
							System.out.println("Enter the amount of deposit :  ") ;
							depositAmount = sc.nextInt();
							balance = balance + depositAmount ;
							System.out.println("Successfully Deposited\nAvailable Balance :  " + balance+" only") ;
							break ;
						case 3 :
							System.out.println("Enter Withdraw Amount :  ") ;
							withdrawAmount = sc.nextInt() ;
							if(withdrawAmount > balance)
							{
								System.out.println("Insufficient Balance\nAvailable balance is:  " + balance + " only") ;
							}
							else
							{
								balance = balance - withdrawAmount ;
								System.out.println("Successfully Withdrawal \nAvailable Balance :  " + balance + " only") ;
							}
							break ;
						case 4 :
							System.out.println("Welcome to our ATM\nAvailable Balance :  " + balance + "\nTotal Amount Deposited :  " + depositAmount + "\nTotal Withdraw Amount :  " + withdrawAmount + "\nThank You") ;
							break ;
						case 5 :
							System.out.println("Thank You") ;
							break ;
						default :
							System.out.println("Please enter correct Choice") ;
					}
					if(Choice == 5)
					{
						break ;
					}
				}
			}
			else
			{
				System.out.println("Please Enter a valid PIN number") ;
			}
			System.out.println("For continuing transition enter 1 overwise enter any number") ;
			int enterOne = sc.nextInt() ;
			if(enterOne != 1)
			{
				System.out.println("Thank You ") ;
				break ;
			}
		}while(yes==1);
		sc.close() ;
	}
}
