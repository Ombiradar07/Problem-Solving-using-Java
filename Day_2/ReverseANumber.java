package Day_2;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		
		int number, reversedNumber=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number....");
		number = sc.nextInt();
		
		while(number!=0) {
			int digit = number%10; // 512 ->   2 1 5 
			reversedNumber = reversedNumber*10+digit;
			number/=10;
		}
		
		System.out.println("Reversed number = "+reversedNumber);
	}

}
