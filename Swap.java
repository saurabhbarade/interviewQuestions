class Swap{
	public
		int a,b;
		a=20; b=14;
		System.out.println("before swapping"+a+" "+b);
		b= a+b;
		a=b-a;
		b=b-a;
		System.out.println("after swapping"+a+" "+b);
	}
}
