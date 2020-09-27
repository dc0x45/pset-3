import java.util.Scanner;

public class Exercise10{
    public static void main(String[] args) {
        System.out.print("Fahrenheit : ");
        Scanner sUSA = new Scanner(System.in);
        double USA = sUSA.nextDouble();

        double cel = (USA - 32) * (5.0/9.0);
        double kelvin = (USA + 459.67) * (5.0/9.0);

        sUSA.close();

        System.out.printf("\nCelsius : %,.2f", cel);
        System.out.printf("\nKelvin : %,.2f\n", kelvin);

    }
}