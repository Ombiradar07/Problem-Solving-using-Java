package Day_5;

import java.util.Scanner;

public class DecimalToBinary {
	
	static String decimalToBinary(int decimal) {
		
		return Integer.toBinaryString(decimal);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal number....");
		int decimal = sc.nextInt();
		
		String binary = decimalToBinary(decimal);
		
		System.out.println("Decimal : "+ decimal+" -> Binary : "+binary);
	}
}
