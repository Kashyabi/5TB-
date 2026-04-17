import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;

        int areaInt = (int) area;   // type casting to int

        System.out.println("Area of rectangle (int) = " + areaInt);

        sc.close();
    }
}

