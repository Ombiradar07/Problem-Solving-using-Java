package Day_7;

import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of Circle..");
		int radius = sc.nextInt();
		
		double area = Math.PI*radius*radius;
		System.out.println("Area of Circle is : "+area);
	}
}
