package Day_1;

import java.util.Scanner;

public class PositiveOrNagative {
    public static void main(String[] args) {

        int number ;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number ");
        number = sc.nextInt();
        sc.close();
        
        if(number<0)
            System.out.println("Its a Nagative Number");
        else if (number>=0)
            System.out.println("Its a Positive Number");
        else
            System.out.println("Not a Number");
    }
    
}