package Day_5;

import java.util.Scanner;

public class BinaryToDecimal {
	
	static int binaryToDecimal(String binary){//1100
		
		int decimal = 0 , base=1;
		 for(int i =binary.length()-1;i>=0;i--) {
			 
			 if(binary.charAt(i)=='1')
				 decimal+=base;
			 
			 base*=2;
		 }
		 
		 return decimal;
	}
	
	public static void main(String[] args) {
		String binary;
		System.out.println("Enter a Binary number....");
		Scanner sc = new Scanner(System.in);
		binary = sc.nextLine();
		System.out.println(binaryToDecimal(binary));
	}
}
