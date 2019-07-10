package main;

public class Ex15_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		
		System.out.println(fact(number));
		

	}
	
	public static int fact(int n) {
		
		if(n <= 1)
			return n;
		else
			return fact(n-1) * n;
	}

}
