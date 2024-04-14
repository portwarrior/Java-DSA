package Recursion.src;

public class Numbers {
    //waf that taskes a number and prints it.
    public static void main(String[] args) {
        printal(2,5);
    }

    static String printal(int x,int y){

        if(x<0|| x==y){ // Add x == x+5 condition to stop recursion
            return "invalid";
        }

        System.out.println(x);
        return printal(x+1,y);
    }
}
