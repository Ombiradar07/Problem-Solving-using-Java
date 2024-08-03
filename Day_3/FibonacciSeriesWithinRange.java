package Day_3;

import java.util.Scanner;

public class FibonacciSeriesWithinRange {
	
	static void printFibonacciWithinRange(long start,long end) {
		
		long f1 = 0, f2 = 1;
		
        while (f1 <= end) {
            if (f1 >= start) {
                System.out.println(f1);
            }
            long f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
		
	}
	public static void main(String[] args) {
		
		long start ,end;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range i.e Start and End value..");
		start = sc.nextLong();
		end = sc.nextLong();
		
		printFibonacciWithinRange(start ,end);
	}

}
