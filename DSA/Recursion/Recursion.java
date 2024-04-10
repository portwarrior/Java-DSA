package Recursion;

public class Recursion {
    public static void main(String[] args) {
        //write a function that prints hello world
        greet(1);
    }
    static String greet(int x){
        if(x==0 || x>10){
            return null;
        }
        System.err.println("This is recursion code running "+x+" times");
        return greet(x+1);
    }
}
