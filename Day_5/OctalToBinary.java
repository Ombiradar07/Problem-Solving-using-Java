package Day_5;

import java.util.Scanner;

public class DecimalToOctal {
	
	static String  decimalToOctal(int decimal) {
			
		return Integer.toOctalString(decimal);
	}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal number....");
		int decimal = sc.nextInt();
		
		String octal = decimalToOctal(decimal);
		
		System.out.println("Decimal : "+ decimal+" -> Octal : "+octal);
	}
}

