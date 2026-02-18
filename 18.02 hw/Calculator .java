import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER THE LENGTH : ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(i+"th INDEX VALUE IS : ");
			arr[i] = sc.nextInt();
		}
		
		while(true)
		{
			System.out.println("***MENU***");
			System.out.println("1. ADDITION");
			System.out.println("2. SUBTRACTION");
			System.out.println("3. MULTIPLICATION");
			System.out.println("4. DIVISION");
			System.out.print("ENTER YOUR CHOICE : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: 
				{
					int sum = 0;
					for(int i=0;i<arr.length;i++)
					{
						sum+=arr[i];
					}
					System.out.println("ADDITION : "+sum);
				}
				break;
				
				case 2: 
				{
					int sub = arr[0];
					for(int i=1;i<arr.length;i++)
					{
						sub-=arr[i];
					}
					System.out.println("SUBTRACTION : "+sub);
				}
				break;
				
				case 3:
				{
					int mul = arr[0];
					for(int i=1;i<arr.length;i++)
					{
						mul*=arr[i];
					}
					System.out.println("MULTIPLICATION : " +mul);
				}
				break;
				
				case 4:
				{
					double div = arr[0];
					for(int i=1;i<arr.length;i++)
					{
						div/=arr[i];
					}
					System.out.println("DIVISION : "+div);
				}
				break;
				
				default :
				{
					System.out.println("INVALID OPTION");
				}
			}
			
		}
	}
}