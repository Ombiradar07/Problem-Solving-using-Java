package Day_2;

import java.util.Scanner;

public class ArmstrongNumberWithinRange {
	
	static void isArmstrongNumberWithinRange(int start , int end) {
		for(int i=start ; i<=end; i++) {
			
			double sum = 0;
			int temp =i;
			int noOfDigits = (int)Math.log10(temp)+1;
			
			while(temp!=0) {
				int digit = temp%10;
				sum += Math.pow(digit, noOfDigits);
				temp /=10;
			}
			
			if(sum == i)
				System.out.print(i+", ");
		}
			
	}
	public static void main(String[] args) {
		int start ,end;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range i.e Start and End values");
		start = sc.nextInt();
		end = sc.nextInt();
		
		isArmstrongNumberWithinRange(start,end);
	}

}
