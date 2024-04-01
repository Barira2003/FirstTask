package task;

import java.util.Scanner;
public class ArmstrongNumber {

    public static int isArmstrong(int n) {
        int originalNumber = n;
        int remainder, sum = 0;
        int numberOfDigits = String.valueOf(n).length();

        while (n > 0) {
            remainder = n % 10;
            sum += Math.pow(remainder, numberOfDigits);
            n /= 10;
        }

        return (sum == originalNumber) ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();
        if (isArmstrong(number) == 1)
        {
        	System.out.println( "1");
        } 
        else 
        {
            System.out.println("0");
        }
         
        scanner.close();
    }
}
