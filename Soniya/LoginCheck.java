import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "12345";

        // Ask user for input
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Check conditions
        if (!username.equals(correctUsername) && !password.equals(correctPassword)) {
            System.out.println("Unable to log in");
        } else if (!username.equals(correctUsername)) {
            System.out.println("Incorrect username");
        } else if (!password.equals(correctPassword)) {
            System.out.println("Incorrect password");
        } else {
            System.out.println("Login successful");
        }

        sc.close();
    }
}