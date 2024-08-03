package Day_3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorsOfNumber {

	static void findFactorsOfNumber(int number) {

		// Simple and Straight forward method
		
		  for(int i=1;i<=number;i++)
			  if(number%i==0) 
				  System.out.print(i+" ");
		 
		
		
		// Efficient for large numbers
		for (int i = 1; i <= Math.sqrt(number); i++) {

			if (number % i == 0) {
				System.out.print(" "+i + " ");

				if (i != number / i)
					System.out.print(number / i);
			}
		}
		
		//Using Stram Api
		
		IntStream.rangeClosed(1, number).filter(i->number%i==0).forEach( System.out::println);

	}

	public static void main(String[] args) {

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		number = sc.nextInt();

		findFactorsOfNumber(number);
	}

}
