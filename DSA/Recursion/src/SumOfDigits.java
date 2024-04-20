package Recursion.src;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOD(91));
    }

    static int sumOD(int n){
        if(n==0) return 0;
        return n%10+sumOD(n/10);
    }
}
