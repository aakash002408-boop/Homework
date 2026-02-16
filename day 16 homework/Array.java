import java.util.Scanner;
class Array
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		int len = sc.nextInt();
		int ar[] = new int[len];
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("index no "+":"+ i);
			ar[i]=sc.nextInt();
		}
		for(int j=0;j<ar.length;j++)
		{
			System.out.print(ar[j]+",");
		}
		
	}
}