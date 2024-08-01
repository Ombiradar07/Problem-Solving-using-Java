package Day_1;

import java.util.Scanner;

public class GreatestOfTwoNukmber {
	public static void main(String[] args) {
		int number1,number2;
		
		System.out.println("Enter two numbers");
		
		Scanner sc = new Scanner(System.in);
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		if(number1>number2)
			System.out.println("Greatest number is "+number1);
		else if(number2>number1)
			System.out.println("Greatest is number is "+number2);
		else
			System.out.println("Both are equal");
	}
}
