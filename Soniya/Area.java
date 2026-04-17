import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        double area = (base * height) / 2;
        System.out.println("Area of Triangle = " + area);


        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        double cubeVolume = side * side * side;
        System.out.println("Volume of Cube = " + cubeVolume);


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