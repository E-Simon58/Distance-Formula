import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declare Variables
        double x1; double y1;
        double x2; double y2;

        //Prompt User Input
        System.out.print("Enter x1 and y1: ");
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        //Compute Distance Formula
        double a = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);

        //Print Result
        System.out.printf("The distance between the two points is %.3f", Math.sqrt(a));
    }
}