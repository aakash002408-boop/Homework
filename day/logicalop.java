class Logicalop
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		
		boolean c = (a>5)&&(b<10);
		boolean d = (a<=70)||(b==5);
		boolean e = !((a!=10)&&!(b<=20));
		
		
		
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}