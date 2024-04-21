package Recursion.src;

public class ReversingNumber {
    public static void main(String[] args) {
        reversals(16539);
        System.out.println(sum);
    }
    static int sum=0;
    static void reversals(int n){
        if(n==0) return;
        int rem=n%10;
        sum=sum *10 +rem;
        reversals(n/10);
    }
}
