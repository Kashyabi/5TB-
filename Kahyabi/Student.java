// public class Student {
//     public static void main(String[] args) {
//         int x=10;
//         int y=12;
//         if(x+y>20){
//             System.out.println("x+y is greater than 20");
//         }
//     }
// }


import java.util.Scanner;
  public class Student {
  
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

        if (sum1 >= sum2) {
            System.out.println("Sum of a+b+c (" + sum1 + ") is greater than or equal to sum of d+e+f (" + sum2 + ")");
        } else {
            System.out.println("Sum of a+b+c (" + sum1 + ") is less than sum of d+e+f (" + sum2 + ")");
        }

        sc.close();
    }
}