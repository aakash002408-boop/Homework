import java.util.Scanner;
class SwitchScanner
{
		public static void main(String[] args)
		{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Initial : ");
	char initial = sc.next().charAt(0);

		
		switch (initial)
		{
			case 'k' :
		    System.out.println("Aakash");
			break;
			case 'c' :
			System.out.println("Lawrence");
			break;
			case 'm' :
			System.out.println("Vignesh");
			break;
			case 'j' :
			System.out.println("Prajan");
			break;
			case 's' :
			System.out.println("Jeeva");
			break;
			default :
			System.out.println("Invalid Initial");
			
			
		}
	}
}