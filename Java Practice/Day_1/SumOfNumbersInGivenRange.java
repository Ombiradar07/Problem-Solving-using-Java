package Day_1;

import java.util.Scanner;

public class SumOfNumbersInGivenRange {
	public static void main(String[] args) {
		
		int start ,end;
		int sum =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Starting value and Ending Value of Range ");
		start = sc.nextInt();
		end = sc.nextInt();
		
		for (int i = start; i <=end; i++) 
			sum+=i;
		
		System.out.println("Total Sum = "+sum);
	}
}
