package Day_7;

import java.util.Scanner;

public class VowelOrConsonant {
	static void checkVowelOrConsonant(char c) {

		char s = Character.toLowerCase(c);

		if (s >= 'a' && s <= 'z') {
			if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u')
				System.out.println("Vowel");
			else
				System.out.println("Consonant");
		}
		else
			System.out.println("Enter a valid Character..");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character....");
		char c = sc.next().charAt(0);

		checkVowelOrConsonant(c);

	}

}
