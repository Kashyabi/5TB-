// this is a single line comment
/* this is a multi-line comment
multi-line shift+alt+A */
// public class HelloWorld {
//     public static void main(String[] args) {
//         System.out.println("Hello, rujna!");
    
//     }
// }

// public class HelloWorld {
//     public static void main(String[] args) {
//         String str = "Tony\tStark";
//     system.out.println(str);
    

//     }
// }

public class Krauszh {
    int x = 89;
    static int y = 10;

    void study() {
        int x = 67;
        System.out.println(x);
        System.out.println(this.x);

    }

    public static void main(String[] args) {
        Krauszh kr = new Krauszh();
        kr.study();
        System.out.println(kr.x);
        System.out.println(Krauszh.y);
    }

}