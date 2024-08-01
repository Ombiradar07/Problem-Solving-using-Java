package Day_1;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
	public static void main(String[] args) {
		
		int n ;
		int sum =0;
		System.out.println("Enter the value for N ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		for (int i = 1; i <=n; i++) 
			sum+=i;		

		System.out.println("Sum of First "+n+" natural number is "+sum);
	}

}
