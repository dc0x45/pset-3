import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.print("Salary  : ");
        Scanner sSalary = new Scanner(System.in);
        double salary = sSalary.nextDouble();
        
        System.out.print("401(k)  : ");
        Scanner s401k = new Scanner(System.in);
        double four01k = s401k.nextDouble();

        System.out.print("Federal : ");
        Scanner sFed = new Scanner(System.in);
        double fed = sFed.nextDouble();

        System.out.print("State   : ");
        Scanner sState = new Scanner(System.in);
        double state = sState.nextDouble();

        double biSalary = salary / 24;

        double de401 = (biSalary * (four01k/100));
        biSalary = biSalary - de401;
        double deFed = (biSalary * (fed/100));
        double deState = (biSalary * (state/100));

        double calced = biSalary - (deFed+deState);

        sSalary.close();
        s401k.close();
        sFed.close();
        sState.close();

        String cast = String.format("\n$%,.2f.", calced);

        System.out.println(cast);

    }
}

