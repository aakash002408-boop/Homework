import java.util.Scanner;
class Order 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System .out.print("Enter order status : ");
		char code = sc.next().charAt(0);
		
		switch (code)
		{
			case 'p' :
			System.out.println("Order placed");
			break;
			case 's' :
			System.out.println("Shipped");
			break;
			case 'd' :
			System.out.println("Deliverd");
			break;
			case 'c' :
			System.out.println("canclled");
		}
	}
}