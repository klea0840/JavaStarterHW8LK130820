package Methods2;

import java.util.Scanner;

public class SumOfNumbers {

    private static int sumDigits (int a) {

        if (a < 10) {
            return a;
        } else {
            return sumDigits(a / 10) + a % 10;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = num * (-1);
        }

        int x = sumDigits(num);
        System.out.println("Sum of digits: " + x);

    }
}
