package Day_3;

import java.util.Scanner;

public class PowerOfANumber {
	
	static int findPowerOfNumber(int base , int power) {
		int result=1;
		for(int i=1;i<=power;i++)
			result *=base;
		
		// Recursive method
		/*
		 * if(power==0)
		 * return 1;
		 * 
		 * return base*findPowerOfNumber(base , number-1);
		 */
		
		return result;
	}
	public static void main(String[] args) {
		
		int base ,power;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base value..");
		base = sc.nextInt();
		System.out.println("Enter the power value..");
		power=sc.nextInt();
		
		System.out.println(base +" to the power of "+ power +" is "+  findPowerOfNumber(base,power));
	}

}
