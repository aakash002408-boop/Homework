import java.util.Scanner;
class ArayNew
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		int ar[] = new int[3];
		
		for(int i=0;i<3;i++)
		{
			ar[i] = sc.nextInt();
		}
		int sum = ar[0]+ar[1];
	}
}