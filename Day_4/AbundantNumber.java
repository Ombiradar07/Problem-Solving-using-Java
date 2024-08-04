package Day_4;

import java.util.Scanner;

public class AbundantNumber {
	static boolean isAbundantNumber(int number){
		
		// Sum of all proper divisors should be grater than number itself
		
		int sum=0;
		
		for(int i =1;i<number;i++) {
			if(number%i==0) 
				sum+=i;
		}
		return sum>number;
	} 
	
	public static void main(String[] args) {
		int number;
		System.out.println("Enter a number...");
		Scanner sc = new Scanner(System.in);
		number= sc.nextInt();
		
		System.out.println(isAbundantNumber(number));
	}

}
