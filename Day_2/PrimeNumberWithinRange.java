package Day_2;

import java.util.Scanner;

public class PrimeNumberWithinRange {
	
	static void primeNumbersFromStartToEnd(int start , int end) {
		for (int i = start; i <=end; i++) {
			
			// if i is prime then print else skip
			if(i<2)
				continue;
			boolean isPrime = true;
			
			for(int j =2; j<= Math.sqrt(i) ;j++) {
				if(i%j==0) {
					isPrime=  false;
					break;
				}
			}
				if(isPrime)
				System.out.print(i+" ");
		}
		
	}
	public static void main(String[] args) {
		
		int start,end;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range i.e Start and End value");
		start = sc.nextInt();
		end = sc.nextInt();
		
		primeNumbersFromStartToEnd(start,end);
		
	}

}
