public class operations {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int sum = a + b;
        int diff = a - b;
        int mod = a % b;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mod);
        System.out.println("The multiplication of a and b is: " + (a * b));
    }
    }
    
    class TernaryOpertor {
        public static void main(String[] args){
            int Days = 29;
            String output = (Days == 28) ? "Not a leap year" : "Leap year";
            System.out.println(output);

        }
    }

         class votingAge {
        public static void main(String[] args){
            int age = 18;
            String result = (age >= 18) ? "You are eligible to vote" : "You are not eligible to vote";
            System.out.println(result);
    
        }
    }

 