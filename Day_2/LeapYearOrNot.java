package Day_2;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to check whether its Leap or not");
		year = sc.nextInt();
		
		if((year%100 !=0 && year%4==0) ||( year %400==0))
			System.out.println(year+" Is a Leap Year");
		else
			System.out.println(year+" Is not a Leap Year");
		
	}

}
