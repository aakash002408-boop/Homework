import java.util.Scanner;
class Signal
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Colour : ");
		char colour = sc.next().charAt(0);
		
		switch (colour)
		{
			case 'r' :
			System.out.println("Stop");
			break;
			case 'y' :
			System.out.println("Ready");
			break;
			case 'g' :
			System.out.println("GO");
			break;
			
			
		}
	}
	
}
