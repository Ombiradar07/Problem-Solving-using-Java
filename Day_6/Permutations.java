package Day_6;

import java.util.Scanner;

// Permutations in which n people can occupy r seats in a classroom 

public class Permutations {
	static int factorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

	static void findPermutations(int people, int seats) {
		// ncr = n!/(n-r)!
		if (seats > people) {
			System.out.println("Number of seats cannot exceed the number of people.");
			return;
		}
		long permutations = factorial(people) / factorial(people - seats);

		System.out.println("Number of permutations between people and seats = " + permutations);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of people and number of seats");
		int people = sc.nextInt();
		int seats = sc.nextInt();

		findPermutations(people, seats);
	}

}
