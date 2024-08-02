package Day_2;

import java.util.Scanner;

public class ArmstrongNumber {
	
	static boolean isArmstrongNumber(int number) {
		
		int noOfDigits = 0;
		double sum =0;
		
//		int temp = number;
//		while (temp != 0) {
//			temp /= 10;
//			noOfDigits++;
//		}
		
		
		// we can get no of digits directly
		noOfDigits = (int)Math.log10(number)+1; 
		
		
		int temp = number;
		while(temp!=0) {
			int digit =  temp%10;
			sum = sum + Math.pow(digit, noOfDigits);
			temp/=10;
		}
		
	return sum == number;
	}
	public static void main(String[] args) {
		int number ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		number = sc.nextInt();
		
		if(isArmstrongNumber(number))
			System.out.println(number+" Is a Armstrong");
		else
			System.out.println(number+" Is not an Armstrong");
	}

}
