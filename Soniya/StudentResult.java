import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks of subject 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks of subject 3: ");
        double m3 = sc.nextDouble();
        System.out.print("Enter marks of subject 4: ");
        double m4 = sc.nextDouble();
        double total = m1 + m2 + m3 + m4;
        double percentage = total / 4;
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
        if (percentage >= 70) {
            System.out.println("Result: First Class");
        } 
        else if (percentage > 59) {
            System.out.println("Result: Upper Second Class");
        } 
        else if (percentage > 49) {
            System.out.println("Result: Second Class");
        } 
        else if (percentage > 39) {
            System.out.println("Result: Third Class");
        } 
        else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}