import java.util.Scanner;

public class division {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);

        int product = num1 * num2;
        System.out.println("Product = " + product);

        double result = (double) sum / product;
        System.out.println("Division of Sum and Division = " + result);

        sc.close();
    }
}
