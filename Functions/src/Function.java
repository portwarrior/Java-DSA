import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        //q:take input of 2 numbers and print the sum
        System.out.println(sum());
        
    }
    static int sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        int b=in.nextInt();
        System.out.println("Enter the second number");
        int c=in.nextInt();
        in.close();
        return b+c;
    }
}
