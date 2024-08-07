package Day_7;

import java.util.Scanner;

public class IsAlphabet {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet ");
		char alphabet = sc.next().charAt(0);
		
		
		char c = Character.toLowerCase(alphabet);
		
		if(c>='a' && c<='z')
			System.out.println("Its an Alphabet");
		else
			System.out.println("Its not an alphabet");
	
	}

}
