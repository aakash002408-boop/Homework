class Mixedop
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		int c = 15;
		
		System.out.println("Arithmatic Operator");
		
		int d = a+b;
		int e = c-b;
		int f = a*b;
		int g = a/c;
		int h = b%c;
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println("*************");
		
		System.out.println("Assignment Operator");
		
		d+=10;
		e-=2;
		f*=5;
		h/=d;
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(h);
		System.out.println("**************");
		System.out.println("Relational Operator");
		
		boolean n = (d<e);
		boolean o = (h>f);
		boolean p = (e>=h);
		boolean q = (f<=e);
		boolean r = (e!=d);
		
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println("**************");
		System.out.println("Logical Operator");
		
		boolean s = (h>f)&&(e<=d);
		
		System.out.println(s);
		
		boolean t = (d!=e)||(f<=f);
		
		System.out.println(t);
		
		boolean u = (d==e)&&!(f<=d);
		
		System.out.println(u);
		
		boolean v = !((f<e)&&(h<=d)||(e!=f));
		
		System.out.println(v);
	}
}