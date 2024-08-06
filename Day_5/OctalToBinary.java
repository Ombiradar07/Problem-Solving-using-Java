package Day_5;

import java.util.Scanner;

public class OctalToBinary {
	static String octalToBinary(String octal) {
		
		int decimal = Integer.parseInt(octal, 8);
		
		return Integer.toBinaryString(decimal);	
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Octal number....");
		String octal = sc.next();
		
		String binary = octalToBinary(octal);
		
		System.out.println("Octal : "+ octal+" -> Binary : "+binary);
	}
}

