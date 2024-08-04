package Day_4;

import java.util.Scanner;

public class LCM {

	static int findHCF(int a, int b) {

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	static void findLCM(int a,int b) {
		int lcm = (a*b)/findHCF(a, b);
		System.out.println("LCM = "+ lcm);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers...");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		findLCM(a, b);
	}

}
