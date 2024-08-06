package Day_6;

import java.util.Scanner;

public class ReplaceZerosByOnes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.....");  
		/*
		 * int number = sc.nextInt();
		 * int newNumber = 0;
		 * 
		 * while(number !=0) { //1100 int digit = number%10; if(digit == 0) digit =1;
		 * newNumber = newNumber*10+digit; number/=10; }
		 * 
		 */
		
		//Efficient
		String number = sc.next();	
		String newNumber = number.replace('0', '1');
		 int result = Integer.parseInt(newNumber); 
		
		System.out.println(result);
		
		
		
	}
}
