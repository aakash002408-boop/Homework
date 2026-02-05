import java.util.Scanner;
class Language 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("language : ");
		int lang = sc.nextInt();
		
		switch (lang)
		{
			case 1 :
			System.out.println("Tamil");
			break;
			case 2 :
			System.out.println("english");
			break;
			case 3 :
			System.out.println("Hindi");
			break;
			case 4 :
			System.out.println("Malayalam");
		}
		
		
	}
}