import java.util.Scanner;

public class MultipleCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Square
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        double areaSquare = side * side;
        double perimeter = 4 * side;

        System.out.println("Area of Square = " + areaSquare);
        System.out.println("Perimeter of Square = " + perimeter);

        // Simple Interest
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        double si = (p * t * r) / 100;
        System.out.println("Simple Interest = " + si);

        // Triangle
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        double areaTriangle = (base * height) / 2;
        System.out.println("Area of Triangle = " + areaTriangle);

        // Cube
        System.out.print("Enter side of cube: ");
        double cubeSide = sc.nextDouble();
        double cubeVolume = cubeSide * cubeSide * cubeSide;

        System.out.println("Volume of Cube = " + cubeVolume);

        // Cuboid
        System.out.print("Enter length of cuboid: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of cuboid: ");
        double width = sc.nextDouble();
        System.out.print("Enter height of cuboid: ");
        double h = sc.nextDouble();

        double cuboidVolume = length * width * h;
        System.out.println("Volume of Cuboid = " + cuboidVolume);

        sc.close();
    }
}
