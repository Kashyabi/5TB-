import java.util.Scanner;

public class vari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num");
        int a = sc.nextInt();
        System.out.println("Enter the second num");
        int b = sc.nextInt();
        System.out.println("Enter the third num");
        int c = sc.nextInt();
        int sum = a + b + c;
        int d = 20;
        int e = 20;
        int f = 20;
        int sum1 = d + e + f;
        if (sum > sum1) {
            System.out.println("The sum of 3 input is greater than Sum");
            if (a > b && a > c) {
                System.out.println(a + " is greater");

            } else if (b > a && b > c) {
                System.out.println(b + " is greaeter");
            } else {
                System.out.println(c + " is greater");
            }
        } else if (sum == 0) {
            System.out.println("The sum can't be 0");
        } else {
            System.out.println("The sum of D,E,F is greater");
        }
        sc.close();
    }

}