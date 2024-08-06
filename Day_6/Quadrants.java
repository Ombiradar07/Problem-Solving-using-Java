package Day_6;

import java.util.Scanner;

public class Quadrants {

    static void identifyTheQuadrant(int x, int y) {
        if (x > 0 && y > 0)
            System.out.println("X and Y coordinates lie in the First Quadrant.");
        else if (x < 0 && y > 0)
            System.out.println("X and Y coordinates lie in the Second Quadrant.");
        else if (x < 0 && y < 0)
            System.out.println("X and Y coordinates lie in the Third Quadrant.");
        else if (x > 0 && y < 0)
            System.out.println("X and Y coordinates lie in the Fourth Quadrant.");
        else if (x == 0 && y != 0)
            System.out.println("Point lies on the Y-axis.");
        else if (y == 0 && x != 0)
            System.out.println("Point lies on the X-axis.");
        else
            System.out.println("Point lies at the Origin.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for X and Y coordinates:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        identifyTheQuadrant(x, y);
    }
}
