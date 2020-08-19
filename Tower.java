class Tower
{
	public static void m1(int n,char s,char a,char d)
	{
		if(n==1)
		{
			System.out.println(s+" "+d);	
		}
		else
		{
			m1(n-1,s,d,a);
			System.out.println(s+" "+d);//excessive recursion
			m1(n-1,a,s,d);			
		}
	}
}
class Test
{
	public static void main(String a[])
	{
		int n=Integer.parseInt(a[0]);
		new Tower().m1(n,'a','b','c');
	}
}



class Test1
{
	public static void m1(int n)
	{
		if(n>0)
		{
			m1(n-1);//head recursion
			System.out.println(n);
			m1(n-1);//tail recursion
		}
	}
	public static void main(String a[])
	{
		new Test1().m1(5);
	}
}