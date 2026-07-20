package day_3;

public class Methods_Ex {
	
	int Add(int a , int b) {
		return a+b;
	}
	int Sub(int a , int b) {
		return a-b;
	}
	int Mul(int a, int b) {
		return a*b;
	}
	
	int div(int a, int b) {
		return a/b;
	}
	int Squ(int a) {
		return a*a;
	}
	int Cube(int a) {
		return a*a*a;
	}
	
	int Factorial(int a) {
		int fact = 1;
		for(int i=1;i<=a;i++) {
			fact *=i;
		}
		return fact;
	}
	
	boolean isPrime(int a) {
		boolean prime = false;
		for(int i=2; i<=Math.sqrt(a);i++) {
			if(a %i ==0) {
				prime =false;
				break;
			}
			else {prime = true;}
		}	
		return prime;
	}
	
	boolean palindrome(int a) {

	    int b = a;
	    int rev = 0;

	    while (b > 0) {

	        int digit = b % 10;
	        rev = rev * 10 + digit;
	        b = b / 10;
	    }

	    return rev == a;
	}
	
	void Fibonacci(int a) {
		int nextterm=0;
		int first=0;
		int second=1;
		for(int i=1;i<=a;i++) {
			System.out.print(nextterm+" ");
			nextterm = first+second;
			first=second;
			second=nextterm;
		
		}	System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods_Ex p = new Methods_Ex();
		int a=p.Add(10,20);
		int s=p.Sub(90, 30);
		int m=p.Mul(20, 50);
		int d=p.div(90, 9);
		int sq=p.Squ(9);
		int cu=p.Cube(5);
		int fa=p.Factorial(5);
		boolean prime=p.isPrime(5);
		boolean check=p.palindrome(8998);
		p.Fibonacci(10);
		System.out.println("Addtion is : "+a);
		System.out.println("Subtraction = "+s);
		System.out.println("Multplycation = "+m);
		System.out.println("Division = "+d);
		System.out.println("Square = "+sq);
		System.out.println("Cube = "+cu);
		System.out.println("Factorial = "+fa);
		System.out.println("Is number Prime : "+prime);
		System.out.println("Number is : "+check);
	}

}
