package Recursion;

public class Numbers {
    //waf that taskes a number and prints it.
    public static void main(String[] args) {
        printal(2);
    }

    static String printal(int x){
        if(x<0|| x<x+5){
            return "invalid";
        }

        System.out.println(x);
        return printal(x+1);
    }
}
