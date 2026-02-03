class Assignmrnt 
{
	public static void main(String[] args)
	{
		int a = 10;
		
		int b = (a += 10);
		int c = (a -= 10);
		int d = (a *= 10);
		int e = (a /= 10);
		int f = (a %= 10);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
}