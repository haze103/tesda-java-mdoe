public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(null, 5);
        Rectangle rectangle = new Rectangle(6, 4);

        System.out.println("Circle:");
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", circle.calculatePerimeter());
        System.out.println("\nRectangle:");
        System.out.printf("Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.calculatePerimeter());
    }
}