import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the grade:");
        char grade = sc.nextLine().toUpperCase().charAt(0);

        System.out.println("Enter the marks:");
        int marks = sc.nextInt();

        switch (grade) {
            case 'A':
                System.out.println("Congratulations, you got grade A");
                switch (marks / 10) {
                    case 10:
                    case 9:
                        System.out.println("Excellent performance!");
                        break;
                    default:
                        System.out.println("Good but can improve.");
                }
                break;

            case 'B':
                System.out.println("Congratulations, you got grade B");
                switch (marks / 10) {
                    case 8:
                    case 7:
                        System.out.println("Nice work!");
                        break;
                    default:
                        System.out.println("Keep practicing.");
                }
                break;

            case 'C':
            case 'D':
            case 'F':
                System.out.println("Needs improvement.");
                break;

            default:
                System.out.println("Invalid input.");
        }

        sc.close();
    }
}