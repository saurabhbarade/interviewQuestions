class Fibonacci{
	public static void main(String args[]){
		int num,num1,num2,num3;
		num=5; num1=0; num2=1;
		for(int i=0; i<num; i++){
			System.out.print(num1+" ");
			num3 = num2+num1;
			num1=num2;
			num2=num3;
		}
		System.out.println();

		for(int j=0; j<num; j++){
			System.out.print(fib(j)+" ");
		}
	}
	
	static int fib(int j){
		if(j<=1)
			return j;
		else
			return fib(j-1)+fib(j-2);
	}
}