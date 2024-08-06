package Day_5;

import java.util.Scanner;

public class BinaryToOctal {
	
	static String binaryToOCtal(String binary) {
		int decimal = Integer.parseInt(binary, 2);
		return Integer.toOctalString(decimal);
	}
	public static void main(String[] args) {
		System.out.println("Enter a Binary Number...");
		Scanner sc = new Scanner(System.in);
		String binary = sc.next();
		
		String octal = binaryToOCtal(binary);
		
		System.out.println("Binary : "+binary+" -> Octal : "+octal);
	}

}
