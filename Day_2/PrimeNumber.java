package Day_2;

import java.util.Scanner;

public class PrimeNumber {
	
	static boolean isPrimeOptimized(int number) {
		
		if(number<2)
		return false;
		
		if(number==2 || number==3)
			return true;
		
		if(number%2==0 || number%3==0)
			return false;
		
		for(int i=5; i*i <= number; i+=6) {
			if(number%i==0 || number%(i+2)==0)
				return false;
		}
		return true;
		
	}
	
	static boolean isPrimeBruteforce(int number) {
		if(number<2)
			return false;
		
		for(int i=2;i<number;i++)
			if(number%i==0)
				return false;
				
		return true;
	}
	public static void main(String[] args) {
		
		int number;
		boolean check = false ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number!!!");
		number = sc.nextInt();
		
		
		if( isPrimeOptimized(number) || isPrimeBruteforce(number))
			System.out.println("Prime");
		else 
			System.out.println("Not a Prime");
	}
	

}
