package Methods2;

import java.util.Scanner;

public class Reverse {

    static void reverseSeq (int a) {

        if (a < 10) {
            System.out.print(a);
            return;
        } else {
            System.out.print(a % 10);
            reverseSeq(a / 10);
            return;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = num * (-1);
        }
        reverseSeq(num);
    }
}
