package Recursion.src;

public class Fibonacci {
    public static void main(String[] args) {
        int x=Fibo(5);
        System.out.println(x);
    }
    public static int Fibo(int n){
        if(n-1==0){
            return 0;
        }
        if(n-2==0){
            return 1;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
}


