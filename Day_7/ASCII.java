package Day_7;

import java.util.Scanner;

public class ASCII {
	public static void main(String[] args) {
		System.out.println("Enter a character...");
		Scanner sc = new Scanner(System.in);
		char c  = sc.next().charAt(0);
		
		System.out.println("ASCII value of "+c+" is "+(int)c);
	}
}
