package Recursion.src;

public class onetoN {
    public static void main(String[] args) {
        other(1, 10);
        anotherone(10);
    }

    static void other(int current,int n){
        if(current>n) return;
        System.out.println(current);
        other(current+1,n);
    }

    static void anotherone(int n){
        if(n==0) return;
        anotherone(n-1);
        System.out.println(n);
    }
}
