package task;
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        int n, num, reversedNum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        num = n;
        
        while (num != 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num /= 10;
        }

        if (n == reversedNum) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }

        scanner.close();
    }
}
