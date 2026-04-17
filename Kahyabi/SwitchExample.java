import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        String time = args[1];
        switch (day) {
            case 1:
                System.out.println("Monday");

                switch (time) {
                    case m:
                        System.out.println("Its Morning");
                        break;
                    case a:
                        System.out.println("Its Day");
                        break;
                    case n:
                        System.out.println("Its Night");
                        break;
                    default:
                        System.out.println("Invalid time");
                }
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        scanner.close();
    }
}