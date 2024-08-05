package Day_5;

import java.util.Scanner;

public class BinaryToOctal {
	
	public static void main(String[] args) {
		System.out.println("Enter a Binary Number...");
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		
		System.out.println(Integer.toOctalString(binary));
	}

}
