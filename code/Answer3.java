import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of Circle");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");
        int val = inp.nextInt();

        if (val == 3) {
            System.out.println("Exit Program");
            inp.close();
            return;
        }

        System.out.print("Enter radius: ");
        double radius = inp.nextDouble();

        switch (val) {
            case 1 -> System.out.printf("Area = %.2f\n", calArea(radius));
            case 2 -> System.out.printf("Circumference = %.2f\n", calCircumference(radius));
            default -> System.out.println("Invalid choice.");
        }

        inp.close();
    }

    public static double calArea(double r) {
        return Math.PI * r * r;
    }

    public static double calCircumference(double r) {
        return 2 * Math.PI * r;
    }
}
