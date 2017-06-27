public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        System.out.println(gcd(12,50));
    }


    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
