// import java.util.Scanner;

// public class SwitchExample {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a day number (1-7): ");
//         int day = sc.nextInt();  

//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day");
//         }

//         sc.close(); 
//     }
// } 

// import java.util.Scanner;

// public class NestedSwitchExample {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a day number (1-7): ");
//         int day = sc.nextInt();

        
//         if (day >= 1 && day <= 7) {
            
//             switch (day) {
//                 case 1:
//                     System.out.println("Monday");
//                     break;
//                 case 2:
//                     System.out.println("Tuesday");
//                     break;
//                 case 3:
//                     System.out.println("Wednesday");
//                     break;
//                 case 4:
//                     System.out.println("Thursday");
//                     break;
//                 case 5:
//                     System.out.println("Friday");
//                     break;
//                 case 6:
//                     System.out.println("Saturday");
//                     break;
//                 case 7:
//                     System.out.println("Sunday");
//                     break;
//             }
//         } else {
           
//             System.out.println("Invalid day number!");
//         }

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class SwitchExample {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number (1-7) for the day: ");
//         int day = scanner.nextInt();

//         switch (day) {
//             case 1:
//                 System.out.println("Monday");

//                 // Nested switch for time of day
//                 System.out.print("Enter time (1-Morning, 2-Day, 3-Night): ");
//                 int time = scanner.nextInt();

//                 switch (time) {
//                     case 1:
//                         System.out.println("Good Morning!");
//                         break;
//                     case 2:
//                         System.out.println("Good Day!");
//                         break;
//                     case 3:
//                         System.out.println("Good Night!");
//                         break;
//                     default:
//                         System.out.println("Invalid time");
//                 }
//                 break;

//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day");
//         }

//         scanner.close();
//     }
// }

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7:");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");

                System.out.println("Enter time (1=Morning, 2=Afternoon, 3=Evening):");
                int time = sc.nextInt();   

                switch (time) {
                    case 1:
                        System.out.println("Morning");
                        break;
                    case 2:
                        System.out.println("Afternoon");
                        break;
                    case 3:
                        System.out.println("Night");
                        break;
                    default:
                        System.out.println("OTHER TIME");
                }
                break;

            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}