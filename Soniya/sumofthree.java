// import java.util.Scanner;
//   public class sumofthree {
  
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter integer a: ");
//         int a = sc.nextInt();
//         System.out.print("Enter integer b: ");
//         int b = sc.nextInt();
//         System.out.print("Enter integer c: ");
//         int c = sc.nextInt();

//         System.out.print("Enter integer d: ");
//         int d = sc.nextInt();
//         System.out.print("Enter integer e: ");
//         int e = sc.nextInt();
//         System.out.print("Enter integer f: ");
//         int f = sc.nextInt();

//         int sum1 = a + b + c;
//         int sum2 = d + e + f;

//         if (sum1 >= sum2) {
//             System.out.println("Sum of a+b+c (" + sum1 + ") is greater than or equal to sum of d+e+f (" + sum2 + ")");
//         } else {
//             System.out.println("Sum of a+b+c (" + sum1 + ") is less than sum of d+e+f (" + sum2 + ")");
//         }

//         sc.close();
//     }
// }
import java.util.Scanner;
public class sumofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = sc.nextInt();
        System.out.print("Enter integer b: ");
        int b = sc.nextInt();
        System.out.print("Enter integer c: ");
        int c = sc.nextInt();

        System.out.print("Enter integer d: ");
        int d = sc.nextInt();
        System.out.print("Enter integer e: ");
        int e = sc.nextInt();
        System.out.print("Enter integer f: ");
        int f = sc.nextInt();

        int sum1 = a + b + c;
        int sum2 = d + e + f;

        // Special case: neither sum should be zero
        if (sum1 == 0 || sum2 == 0) {
            System.out.println("Sum cannot be zero");
        } else if (sum1 >= sum2) {
            System.out.println("Sum of a+b+c (" + sum1 + ") is greater than or equal to sum of d+e+f (" + sum2 + ")");
        } else {
            System.out.println("Sum of a+b+c (" + sum1 + ") is less than sum of d+e+f (" + sum2 + ")");
        }

        sc.close();
    }
}