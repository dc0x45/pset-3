import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.print("Height : ");
        Scanner sHeight = new Scanner(System.in);
        double height = sHeight.nextDouble();

        System.out.print("Width  : ");
        Scanner sWidth = new Scanner(System.in);
        double width = sWidth.nextDouble();

        double convHeight = height * 25.4;
        double convWidth = width * 25.4;

        sHeight.close();
        sWidth.close();

        double calced = convHeight * convWidth;
        String cast = String.format("%,.2f square millimeters.", calced);

        System.out.println(cast);

    }
}

