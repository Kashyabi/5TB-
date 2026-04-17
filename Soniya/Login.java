import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String us = "samir";
        String psw = "wow";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Username");
        String id = sc.nextLine();

        System.out.println("Enter your Password");
        String pw = sc.nextLine();

        if (us.equals(id) && psw.equals(pw)) {
            System.out.println("Login Successful");
        } else if (!us.equals(id)) {
            System.out.println("Invalid User");
        } else if (!psw.equals(pw)) {
            System.out.println("Invalid Password");
        } else {
            System.out.println("Both are incorrect");
        }

        sc.close();
    }
}