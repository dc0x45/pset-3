import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.print("Wage      : ");
        Scanner sWage = new Scanner(System.in);
        double Wage = sWage.nextDouble();

        System.out.print("Monday    : ");
        Scanner sMon = new Scanner(System.in);
        double Mon = sMon.nextDouble();

        System.out.print("Tuesday   : ");
        Scanner sTues = new Scanner(System.in);
        double Tues = sTues.nextDouble();
        
        System.out.print("Wednesday : ");
        Scanner sWed = new Scanner(System.in);
        double Wed = sWed.nextDouble();

        System.out.print("Thursday  : ");
        Scanner sThur = new Scanner(System.in);
        double Thur = sThur.nextDouble();

        System.out.print("Friday    : ");
        Scanner sFri = new Scanner(System.in);
        double Fri = sFri.nextDouble();
        
        System.out.print("Saturday  : ");
        Scanner sSat = new Scanner(System.in);
        double Sat = sSat.nextDouble();

        System.out.print("Sunday    : ");
        Scanner sSun = new Scanner(System.in);
        double Sun = sSun.nextDouble();

        double total = (Mon+Tues+Wed+Thur+Fri+Sat+Sun)*Wage;

        sWage.close();
        sMon.close();
        sTues.close();
        sWage.close();
        sThur.close();
        sFri.close();
        sSat.close();
        sSun.close();

        String formatted = String.format("\n$%.2f.", total);

        System.out.println(formatted);

    }
}

