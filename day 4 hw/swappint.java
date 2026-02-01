class Swappint
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int temp;
		
		temp = a;
		b = a;
		a = temp;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}