import java.util.Scanner;
public class CompareSums {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the value for x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value 0
        for y: ");
        int y = sc.nextInt();
        System.out.print("Enter the value for z: ");
        int z = sc.nextInt();
        System.out.print("Enter the value for d: ");
        int d = sc.nextInt();
        System.out.print("Enter the value for e: ");
        int e = sc.nextInt();
        System.out.print("Enter the value for f: ");
        int f = sc.nextInt();
        int sum = x + y + z;
        int sum2 = d + e + f;
        System.out.println(sum);
        System.out.println(sum2);
        if (sum >= sum2){
            System.out.println("The condition is true");
        }
        else if(sum == 0 || sum2 == 0){
            System.out.println("The sum cannot be zero");
        }
        sc.close();
    }
}