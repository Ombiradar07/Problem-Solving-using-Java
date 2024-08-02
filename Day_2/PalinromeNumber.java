package Day_2;

import java.util.Scanner;

public class PalinromeNumber {
	
	static boolean isPalindrome(int number) {
		
		int originalNumber = number;
		int reversedNumber = 0;
		
		while(number!=0) {
			int digit = number%10;
			reversedNumber = reversedNumber *10+digit;
			number/=10;
		}
		
		if(originalNumber ==reversedNumber)
		return true;
		
		return false;
	}
	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.....");
		number = sc.nextInt();
		
		if(isPalindrome(number))
			System.out.println(number+ " Is a Palindrome Number");
		else
			System.out.println(number+ " Is not a Palindrome Nummber");
	}

}
