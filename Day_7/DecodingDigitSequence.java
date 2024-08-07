package Day_7;

import java.util.Scanner;

public class DecodingDigitSequence {

	static int possibleDicodings(String digitSequence) {

		if (digitSequence == null || digitSequence.length() == 0 || digitSequence.charAt(0) == '0')
			return 0;

		int length = digitSequence.length();
		int prev1 = 1;
		int prev2 = 1;

		for (int i = 1; i < length; i++) {

			int count = 0;

			int oneDigit = Integer.parseInt(digitSequence.substring(i, i + 1));
			int twoDigit = Integer.parseInt(digitSequence.substring(i - 1, i + 1));

			if (oneDigit >= 1)
				count += prev1;

			if (twoDigit >= 10 && twoDigit <= 26)
				count += prev2;
			
			prev2 =  prev1;
			prev1 = count;
		}
		return prev1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit sequence");
		String digitSequence = sc.next();

		 System.out.println("Number of ways to decode: " + possibleDicodings(digitSequence));	}

}
