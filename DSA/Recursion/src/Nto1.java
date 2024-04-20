package Recursion.src;

public class Nto1 {
    public static void main(String[] args) {
        some(5);
    }

    static void some(int n){
        if(n==0) return;

        System.err.println(n);
        some(n-1);
    }
}
