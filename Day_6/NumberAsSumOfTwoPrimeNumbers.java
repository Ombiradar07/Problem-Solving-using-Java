package Day_6;

import java.util.Scanner;

public class NumberAsSumOfTwoPrimeNumbers {
	
	static boolean isPrime(int  number) {
		if(number<1)
			return false;
		
		for(int i=2;i<=Math.sqrt(number);i++) 
			if(number%i==0)
				return false;
		
		return true;
	}
	static boolean isPossible(int number) {
		
		return isPrime(number) && isPrime(number-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.....");
		int number = sc.nextInt();
		
		if(isPossible(number))
			System.out.println("Yes, we can write "+number+" As a sum of two  prime numbers");
		else
			System.out.println("No, we can write "+number+" As a sum of two  prime numbers");

	}
}
