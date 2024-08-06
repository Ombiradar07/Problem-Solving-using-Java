package Day_5;

import java.util.Scanner;

public class OctalToDecimal {
	static int octalToBinary(String octal) {
		
	return Integer.parseInt(octal, 8);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Octal number....");
		String octal = sc.next();
		sc.close();
		
		int decimal = octalToBinary(octal);
		
		System.out.println("Octal : "+ octal+" -> Decimal : "+ decimal);
	}
}

