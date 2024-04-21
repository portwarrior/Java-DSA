package Recursion.src;

public class DigitProducts {
    public static void main(String[] args) {
        System.out.println(producct(502));
    }

    static int producct(int n){
        if(n%10==n) return n;
        return n%10 * producct(n/10);
    }
}
