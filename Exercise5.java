import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.print("Homework 1 : ");
        Scanner sHw1 = new Scanner(System.in);
        double hw1 = sHw1.nextDouble();

        System.out.print("Homework 2 : ");
        Scanner sHw2 = new Scanner(System.in);
        double hw2 = sHw2.nextDouble();

        System.out.print("Homework 3 : ");
        Scanner sHw3 = new Scanner(System.in);
        double hw3 = sHw3.nextDouble();
        
        System.out.print("Quiz 1     : ");
        Scanner sQuiz1 = new Scanner(System.in);
        double quiz1 = sQuiz1.nextDouble();

        System.out.print("Quiz 2     : ");
        Scanner sQuiz2 = new Scanner(System.in);
        double quiz2 = sQuiz2.nextDouble();

        System.out.print("Test 1     : ");
        Scanner sTest = new Scanner(System.in);
        double test = sTest.nextDouble();

        double avgHw = (hw1+hw2+hw3)/3;
        double avgQuiz = (quiz1+quiz2)/2;

        sHw1.close();
        sHw2.close();
        sHw3.close();

        sQuiz1.close();
        sQuiz2.close();

        sTest.close();

        double finalGrade = (avgHw * 0.15) + (avgQuiz * 0.35) + (test * 0.5);
        String formatted = String.format("%.2f%%.", finalGrade);

        System.out.println(formatted);

    }
}

