import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Task7 output = new Task7();
        Scanner sc = new Scanner(System.in);
        int intInput1, intInput2;

        System.out.println("Input");
        System.out.print("Enter first number: ");
        intInput1 = sc.nextInt();
        System.out.print("Enter second number: ");
        intInput2 = sc.nextInt();
        System.out.println("\nOutput");
        System.out.println("Sum: " + output.add(intInput1, intInput2));
        System.out.println("Difference: " + output.subtract(intInput1, intInput2));
        System.out.println("Product: " + output.multiply(intInput1, intInput2));

        if (intInput2 == 0)
            System.out.println("Quotient: ERROR! The answer is undefined because the divider is zero.");
        else
            System.out.println("Quotient: " + output.divide(intInput1, intInput2));
    }

    int add(int num1, int num2) {
        return num1 + num2;
    }

    int subtract(int num1, int num2) {
        return num1 - num2;
    }

    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    double divide(double num1, double num2) {
        return num1 / num2;
    }
}
