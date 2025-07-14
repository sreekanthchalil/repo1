package assignment;
public class AreaCalculator {

    // Method to calculate area of a circle
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a rectangle
    public static double area(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate area of a square
    public static double area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        // Area of Circle
        double circleArea = area(5.0);
        System.out.println("Area of Circle (radius = 5.0): " + circleArea);

        // Area of Rectangle
        double rectangleArea = area(10.0, 4.0);
        System.out.println("Area of Rectangle (length = 10.0, breadth = 4.0): " + rectangleArea);

        // Area of Square
        double squareArea = area(6);
        System.out.println("Area of Square (side = 6): " + squareArea);
    }
}
