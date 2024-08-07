package Day_7;

import java.util.Scanner;

public class PrimeNumbers {

	static void printPrimeNumbersFromStartToEnd(int start, int end) {

		for (int i = start; i <= end; i++) {

			if (i <= 1)
				continue;
			else if (i == 2 || i == 3)
				System.out.println(i);
			else {
				boolean prime = true;
				for (int j = 2; j <= Math.sqrt(i); j++) {

					if (i % j == 0) {
						prime = false;
						break;
					}
				}

				if (prime == true)
					System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range i.e  start and end value.. ");

		int start = sc.nextInt();
		int end = sc.nextInt();

		printPrimeNumbersFromStartToEnd(start, end);
	}
}
