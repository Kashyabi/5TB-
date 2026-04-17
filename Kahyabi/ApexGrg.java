public class ApexGrg {
        int x = 89;
    static int y = 10;

    void study() {
        int x = 67;
        System.out.println(x);
        System.out.println(this.x);

    }

    public static void main(String[] args) {
        ApexGrg ra = new ApexGrg();
        ra.study();
        System.out.println(ra.x);
        System.out.println(ApexGrg.y);
    }

}

