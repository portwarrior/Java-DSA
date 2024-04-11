package Recursion.src;

public class Numbers {
    //waf that taskes a number and prints it.
    public static void main(String[] args) {
        printal(2);
    }

    static String printal(int x){
        if(x<0|| x>10){ // Add x == x+5 condition to stop recursion
            return "invalid";
        }

        System.out.println(x);
        return printal(x+1);
    }
}
