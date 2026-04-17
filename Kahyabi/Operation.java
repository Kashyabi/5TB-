public class Operation {
    public static void main( String[] args) {
        int a = 12;
        int b = 12;
        int sum = a + b;
        int mod = a % b;
        int sub = a - b;
        System.out.println(sum); 
        System.out.println(mod);
        System.out.println(sub);
        System.out.println("The multiplication ="+ (a * b));
        System.out.println(a++);
        System.out.println(b++);
        System.out.println(b++ + ++a);
        System.out.println(b++ + ++a + a--);
        System.out.println(a++ + ++b + --b + b++);
    }
}
