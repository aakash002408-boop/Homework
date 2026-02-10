import java.util.Scanner;
class DoWhile
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int i = 1;
		
		
		do
		{
			
			if (i==n)
			break;
  				
			i++;
			System.out.println(i);
		
		}
		while(true);
		
	}  
}