public class parent 
{
	int a=10;
	int b=20;
	public void f1()
	{
		System.out.println(" i m f1 in parent");
	}
	public void f2()
	{
		System.out.println(" i m f2 in parent");
	}
}
class child extends parent
{
	int a=100;
	int c=200;
	public void f1()
	{
		System.out.println(" i m f1 in child");
	}
	public void f3()
	{
		System.out.println(" i m f3 in parent");
	}
}
class inheritance__{
	public static void main(String[] args) 
	{  //case1
		parent p1=new child();
		System.out.println(p1.a);
		System.out.println(p1.b);
		//System.out.println(p1.c);
		System.out.println(((child)(p1)).a);
		System.out.println(((child)(p1)).c);
		p1.f1();//override concept
		p1.f2();
	//	p1.f3();
		((child)(p1)).f3();

		//case2
		child p2=new child();
		System.out.println(p2.a);
		System.out.println(p2.b);
		System.out.println(p2.c);
		System.out.println(((parent)(p2)).a);
		p2.f1();//override concept
		((parent)(p2)).f1();
		p2.f2();
		p2.f3();


		//case3
		System.out.println(p3.a);
		System.out.println(p3.b);
		//System.out.println(p3.c);
		// System.out.println(((child)(p3)).c);

		//case-4
		//child p4=new child();
	}

}