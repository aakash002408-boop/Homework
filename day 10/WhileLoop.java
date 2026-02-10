import java.util.Scanner;
class WhileLoop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value n : ");
		int n = sc.nextInt();
		int i = 1;
		
		
		while(i<=10)
		{
			System.out.println(n*i);
			i++;
		}
	}
}