package Recursion.src;

public class Fibonacci {
    public static void main(String[] args) {
        int x=Fibo(6);
        System.out.println(x);
        int y=Fibo2(6);
        System.out.println(y);
    }
    public static int Fibo(int n){
        if(n-1==0){
            return 1;
        }
        if(n-2==0){
            return 1;
        }
        return Fibo(n-1)+Fibo(n-2);
    }

    public static int Fibo2(int n){
        if(n<2){
            return n;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
}


