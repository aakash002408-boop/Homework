class Opertors
{
	public static void main(String[] args)
	{
		int a = 80;
		int b = 70;
		int c = 60;
		
		System.out.println("arithmatic operators");
		
		
		int d = a+b;
		int e = b-c;
		int f = c*a;
		int g = a/b;
		int h = d%f;
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		System.out.println("***************");
		
		System.out.println("Assignment operators");
		
		 a+=d;
		 c-=f;
         g*=h;
		 b/=e;
		 e%=a;
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(g);
		System.out.println(b);
		System.out.println(e);
		
		System.out.println("*************");
		
		System.out.println("Retional operators");
		
		boolean i = (a==c);
		boolean j = (b!=d);
		boolean k = (e>f);
		boolean l = (f<h);
		boolean m = (d<=g);
		boolean n = (c>=f);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		
		System.out.println("***************");
		
		
		System.out.println("LOgical Operators");
		
		boolean o = (d==a)||(f>=b)&&(h<e)&&(g>=c);
		boolean p = (h<=b)&&!(d==f)||(g!=a)||(e>a);
		boolean q = !((m)||(h>d)&&!(d==f)&&(n));
		boolean r = (l==n)&&(m!=n)||(a<=d)&&!(k);
		
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		
		System.out.println("**************");
		System.out.println("Urnary operators");
		
		int s = 20;
	    int t = 40;
		
		System.out.println(t--);
		System.out.println(++t);
		System.out.println(++s);
		System.out.println(--s);
		
		
		
		
		
		
		
		
	}
}