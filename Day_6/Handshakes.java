package Day_6;

import java.util.Scanner;

public class Handshakes {
	
	private static int calculateNumberOfHandshakes(int people) {
		//formula = n(n-1)/2;
		if(people<1)
			return 0;
		
		return people*(people-1)/2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of  peoples in the Room");
		
		int people = sc.nextInt();
		
		System.out.println("No of Handshakes between "+people+" is "+ calculateNumberOfHandshakes(people));
	}

	

}
