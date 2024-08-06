package Day_6;

import java.util.Scanner;

public class AdditionOfFractions {

	static int gcd(int a, int b) {

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;

	}

	static int addFractions(int num1, int den1, int num2, int den2) {
		int numerator = num1 * den2 + den1 * num2;
		int denominator = den1 * den2;
		
		int gcd = gcd(numerator,denominator);
		numerator/=gcd;
		denominator/=gcd;
		System.out.println("The sum of the fractions is: " + numerator + "/" + denominator);

		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numerator and denominator of the first fraction:");
		int num1 = sc.nextInt();
		int den1 = sc.nextInt();

		System.out.println("Enter the numerator and denominator of the second fraction:");
		int num2 = sc.nextInt();
		int den2 = sc.nextInt();

		addFractions(num1, den1, num2, den2);
	}

}
