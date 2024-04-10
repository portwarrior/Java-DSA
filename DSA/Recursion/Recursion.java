package Recursion;

public class Recursion {
    public static void main(String[] args) {
        //write a function that prints hello world
        greet(0);
    }
    static String greet(int x){
        if(x==0 || x>10){
            return null;
        }
        System.err.println("hello world "+x);
        return greet(x+1);
    }
}
