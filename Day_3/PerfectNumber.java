package Day_3;

import java.util.Scanner;

public class PerfectNumber {
	static boolean isPerfectNumber(int number) {
		
		
		/*
		 * int sum=0;
		 * for(int i=1;i<number;i++) if(number%i==0) sum+=i;
		 * 
		 * return sum==number;
		 */
		
		// Optimized Approach
		int sum = 1;
		if (number <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				sum += i;
				if (i != number / i)
					sum += number / i;
			}
		}
		
		return sum==number;
	}
	
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		number = sc.nextInt();
		
		System.out.println(isPerfectNumber(number));
	}

}
