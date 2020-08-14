package Methods2;

import java.util.Scanner;

public class Bank {

    static void creditCheck(double payment, double credit) {

        if (payment < 0) {
            System.out.println("The payment cannot be less than 0");
        } else if (payment == credit) {
            System.out.println("The debt is 0");
        } else if (payment < credit) {
            System.out.println("The debt is " + (credit - payment));
        } else {
            System.out.println("The overpayment is " + (payment - credit));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the payment: ");
        double payment = sc.nextDouble();

        double credit = 700;
        System.out.println("Credit: " + credit);

        creditCheck(payment, credit);

    }
}
