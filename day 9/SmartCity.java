import java.util.Scanner;
class SmartCity
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Smart City ");
		System.out.println("1. Electricity BIll");
		System.out.println("2. Water Bill");
		System.out.println("3. Internet Plan");
		System.out.println("4. Exit");
		System.out.print("Enter your Option : ");
		int choice = sc.nextInt();
					
			if (choice==1)
			{
				System.out.println("****Electricity Bill****");
			    System.out.print("Enter Units : ");
			    int unit = sc.nextInt();
				int bill;
			
			   if (unit<=100)
			   {
			       bill = unit*2;
			   }
			   else if (unit<=300)
			   {
				   bill = unit*3;
			   }

			   else 
			   {
				   bill = unit*5;
			   }
			   System.out.println("Electricity Bill - RS " + bill);
			}
			
			
			else if (choice==2)
			{
				System.out.println("****Water Bill****");
				System.out.println("1. Appartment");
				System.out.println("2. Individual HOuse");
				System.out.println("Enter your type : ");
				int type = sc.nextInt();
				
				if (type==1)
				{
				System.out.println("1. Appartment");
				System.out.println("Monthly Charge RS:300");
				}
				else if (type==2)
				{
					System.out.println("2. Individual House");
					System.out.println("Monthly Charge RS:500");
				}
			}
				
				else if (choice==3)
				{
					System.out.println("****Internet Plan****");
				   System.out.println("1. Basic Plan");
				   System.out.println("2. Stadard Plan");
				   System.out.println("3. Perimium Plan");
				   System.out.println("Enter your type : ");
				   int nettype = sc.nextInt();
				
				  if (nettype==1)
				  {
				     System.out.println("Basic Plan - RS 399");
				  }
				   else if(nettype==2)
				   {
					   System.out.println("Standard Plan - RS 699");
				   }
				   else if (nettype==3)
				   {
					   System.out.println("Perimium Plan - RS: 999");
				   }
				
				}
               else 
			   {
				   System.out.println("Thank you for using Smart City Utility System");
			   }				   
			
			   
		
	}
}