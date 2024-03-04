import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Whats your name: ");
        String b=in.next();
        System.out.println(greetuser(b));
        greet();
        in.close();
    }

    static String greetuser(String v){
        String user="Hi " + v;
        return user;
    }

    static void greet(){
        System.out.println("Hello World, I am present within a function");
    }
}
