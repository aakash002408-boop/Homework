import java.util.Scanner;
class NestedIf
{
	public static void main(String[] args)
	{
		Scanner sc = next.Scanner(System.in);
		System.out.println("Welcome to Aakash Bhavan");
		System.out.println("1. Dosa");
		System.out.println("2. Biriyani");
		System.out.println("3. Fired Rice");
		System.out.print("Enter your choice : ");
		int chioce = sc.nextInt();
		
		if (Choice==1)
		{
			System.out.prinltn("1. Masala Dosa");
			System.out.prinltn("1. Egg Dosa");
			System.out.prinltn("1. Kari Dosa");
			System.out.println("Enter your option : ");
			int option = sc.nextInt();
			
			
			if(option==1)
			{
			System.out.println("1. Masala Dosa - RS:100");
			}
			else if (option==2)
			{
				System.out.println("2. Egg Dosa - RS:150");
			}
			else if(option==3)
			{
				System.out.println("3. Kari Dosa - RS:200");
			}
			else
			{
				System.out.prinltn("Note Available");
			}
		}
		
		
		 if (Choice==2)
		 {
			 			 System.out.prinltn("1. Chicken BIriyani");
			System.out.prinltn("2. Mutton Biriyani");
			System.out.prinltn("3. Prwan Biriyani");
			System.out.println("Enetr your option : ");
			int option = sc.nextInt();
			
			if(option==1)
			{
			System.out.println("1. Chicken Biriyani - RS:150");
			}
			else if (option==2)
			{
				System.out.println("2. Mutton Biriyani - RS:200");
			}
			else if(option==3)
			{
				System.out.println("3. Prawn Biriyani - RS:250");
			}
			else
			{
				System.out.prinltn("Note Available");
			}
		 }

		 
		
		 if (Choice==3)
		 {
			 System.out.prinltn("1. Chicken Fried Rice");
			System.out.prinltn("2. Egg Fried Rice");
			System.out.prinltn("3. Mutton Fried rice");
			System.out.println("Enetr your option : ");
			int option = sc.nextInt();
			
			
			if(option==1)
			{
			System.out.println("1. Chicken Fried Rice - RS:100");
			}
			else if (option==2)
			{
				System.out.println("2. Egg Fried Rice - RS:80");
			}
			else if(option==3)
			{
				System.out.println("3. Mutton Fried Rice - RS:150");
			}
			else
			{
				System.out.prinltn("Note Available");
			}
		
		 }
		 else 
		 {
			System.out.println("Your Choice is not Available");
		 }
	}
		
		
		
		
	}
}
}