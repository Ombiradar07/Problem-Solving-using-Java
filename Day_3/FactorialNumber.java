package Day_3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorialNumber {
	
	//TODO :  Factorial Using Iterative method
	static int findFactorialOfNumber(int number) {
		int fact = 1;
		for(int i=number;i>=1;i--)
			fact*=i;
		return fact;
	}
	
	//TODO :  Factorial Using Recursive method
	static int factorialByRecursiveMethod(int number) {
	
		if(number==0 || number==1)
			return 1;
		
		return  number *( factorialByRecursiveMethod(number-1));	
	}
	
	//TODO :  Factorial Using Stream API method
	static int factorialByStramApi(int number){
		
		return IntStream.rangeClosed(1, number).reduce(1, (x, y)-> x*y);
		
	}
	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		
		System.out.println("Factorial of "+number +" is "+findFactorialOfNumber(number));
		System.out.println("Factorial of "+number +" is "+factorialByRecursiveMethod(number));
		System.out.println("Factorial of "+number +" is "+factorialByStramApi(number));

	}

}
