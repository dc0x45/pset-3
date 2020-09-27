import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.print("Students : ");
        Scanner sStudents = new Scanner(System.in);
        int students = sStudents.nextInt();
        
        System.out.print("Teachers : ");
        Scanner sTeachers = new Scanner(System.in);
        int teachers = sTeachers.nextInt();

        System.out.print("Capacity : ");
        Scanner sCap = new Scanner(System.in);
        int cap = sCap.nextInt();

        int total = students + teachers;

        double buses = ((double) total / (double) cap) + 0.99999999999;
        int excess = total % cap;
        int wholeBuses = (int) buses;

        sStudents.close();
        sTeachers.close();
        sCap.close();

        String cast = String.format("\nBuses Required      : %d. \nOverflow passengers : %,d.", wholeBuses, excess);

        System.out.println(cast);

    }
}

