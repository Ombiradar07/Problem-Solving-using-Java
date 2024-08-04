package Day_4;

import java.util.Scanner;

public class AutomorphicNumber {

	static boolean isAutomorphicNumber(int number) {
		int square = number * number;

		while (number != 0) {
			if (number % 10 != square % 10)
				return false;

			number /= 10;
			square /= 10;
		}
		return true;
	}

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		number = sc.nextInt();

		System.out.println(isAutomorphicNumber(number));

	}

}

/*
 * Input : N = 76 Output : Automorphic Explanation: As 76*76 = 5776
 * 
 * Input : N = 25 Output : Automorphic As 25*25 = 625
 * 
 * Input : N = 7 Output : Not Automorphic As 7*7 = 49
 */
