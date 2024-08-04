package Day_4;

import java.util.Scanner;

public class HarshadNumber {
	static boolean isHarshadnumber(int number) {
		/*
		 * 1. Extract all the digits from the number using the % operator and calculatethe sum.
		 * 2. Check if the number is divisible by the sum. 
		 * 
		 * Input: 3 Output: 3 is a Harshad Number
		 * 
		 * Input: 18 Output: 18 is a Harshad Number
		 * 
		 * Input: 15 Output: 15 is not a Harshad Number
		 */
		int sum =0;
		int temp =number;
		while(temp!=0) {
			int digit = temp%10;
			sum+=digit;
			temp/=10;
		}
		
		return number%sum==0;
	}
	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		
		System.out.println(isHarshadnumber(number));
	}

}
