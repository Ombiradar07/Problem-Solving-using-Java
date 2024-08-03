package Day_3;

import java.util.Scanner;

public class FibonacciSeries {

	static void printFibonacci(int n) {

		// Printing fibonacci series...
		// f1 = 0 , f2 = 1 and f3= f1+f2

		long f1 = 0, f2 = 1;

		if (n >= 1)
			System.out.println(f1);
		if (n >= 2)
			System.out.println(f2);

		for (int i = 3; i <= n; i++) {
			long f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.println(f3);
		}
	}

	public static void main(String[] args) {
		int nThTerm;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth term of Fibonacci series...");
		nThTerm = sc.nextInt();

		printFibonacci(nThTerm);
	}

}
