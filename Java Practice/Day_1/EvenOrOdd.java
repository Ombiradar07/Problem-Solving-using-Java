package Day_1;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		int number;
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		if(number%2 == 0)
			System.err.println("Its an Even number");	
		else
			System.out.println("Its an Odd number");

	}
	
	

}
