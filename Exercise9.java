import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.print("Amount : ");
        Scanner sCash = new Scanner(System.in);
        double cash = sCash.nextDouble();

        double tmpCash = cash;

        double quarters = tmpCash / 0.25;
        tmpCash -= (int)quarters * 0.25;
        double dimes = tmpCash / 0.1;
        tmpCash -= (int)dimes * 0.1;
        double nickels = tmpCash / 0.05;
        tmpCash -= (int)nickels * 0.05;
        double pennies = tmpCash / 0.01;
        tmpCash -= (int)pennies * 0.01;

        int quartersInt = (int)quarters;
        int dimesInt = (int)dimes;
        int nickelsInt = (int)nickels;
        int penniesInt = (int)pennies;

        sCash.close();

        System.out.printf("\nQuarters : %d", quartersInt);
        System.out.printf("\nDimes    : %d", dimesInt);
        System.out.printf("\nNickels  : %d", nickelsInt);
        System.out.printf("\nPennies  : %d\n", penniesInt);

    }
}
