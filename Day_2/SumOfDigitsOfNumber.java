package Day_2;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
	public static void main(String[] args) {
		
		int number,sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number....");
		number = sc.nextInt();
		
		while(number!=0) {
			
			int digit = number%10;
			sum+=digit;
			number /=10;
		}
		System.out.println("Sum of Digits of in given number is "+sum);
	}

}
