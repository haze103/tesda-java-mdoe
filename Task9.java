import static java.lang.Math.*;

public class Task9 {
    public static int add(int a, int b) {
        int intSum = addExact(a, b);
        return intSum;
    }

    public static int subtract(int a, int b) {
        int intDif = subtractExact(a, b);
        return intDif;
    }

    public static int multiply(int a, int b) {
        int intProd = multiplyExact(a, b);
        return intProd;
    }

    public static float divide(int a, int b) {
        float fltQuo = (float)floorDivExact(a, b);
        return fltQuo;
    }

    public static void main(String[] args) {
        Task9 calcu = new Task9();
        System.out.println("Output:");
        System.out.println("Sum: " + calcu.add(10, 5));
        System.out.println("Difference: " + calcu.subtract(10, 5));
        System.out.println("Product: " + calcu.multiply(10, 5));
        System.out.println("Quotient: " + calcu.divide(10, 5));
    }
}