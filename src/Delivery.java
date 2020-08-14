import java.util.Scanner;

public class Delivery {

    static int calculateRouts (int a) {

        if (a == 1) {
            return 1;
        }  else {
            return(a * calculateRouts(a - 1));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the payment: ");
        int clients = sc.nextInt();

        System.out.println(calculateRouts(clients));
    }
}
