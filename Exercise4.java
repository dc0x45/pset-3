import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.print("Height : ");
        Scanner sHeight = new Scanner(System.in);
        double height = sHeight.nextDouble();
        
        System.out.print("Width  : ");
        Scanner sWidth = new Scanner(System.in);
        double width = sWidth.nextDouble();

        double convHeight = height * 2 * 2.54;
        double convWidth = width * 2 * 2.54;

        sHeight.close();
        sWidth.close();

        double calced = convHeight + convWidth;
        String cast = String.format("%,.2f centimeters.", calced);

        System.out.println(cast);

    }
}

