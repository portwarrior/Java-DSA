package conditionals;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int c = in.nextInt();
        int b = in.nextInt();

        // int max=a;
        // if(b>max){
        //     max=b; 
        // }
        // if(c>max){
        //     max=c;
        // }
        // if(max==b && max==c){
        //     System.out.println("All are equal");
        // }

        // System.out.println(max);

        int max= Math.max(c,Math.max(a, b));
        System.out.println(max);
    }
}
