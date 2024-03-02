package conditionals;
import java.math.BigInteger;
import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        // the program below takes in n as an array and then traverses on it to return the number of times the user's input is present within the array.
        // Scanner in=new Scanner(System.in);
        // int a=in.nextInt();
        // int n[]=new int[]{1,2,3,421,12,123,324,4,2,3,1,4,5,6,2,3,2,1,23,23,13,12123,1231};
        // int counter=0;
        // for(int i=0;i<n.length;i++){
        //     if(n[i]==a){
        //         counter++;
        //     }
        // }
        //System.out.println(counter);

        //the program below takes the input from the user and counts the number of tmes the input appears in the specified word
        
        int a=1212359179;
        Scanner in=new Scanner(System.in);
        int b=in.nextInt();
        int counter=0;
        while(a>0){
           if(a%10==b){
            counter++;
           }
           a=a/10;
        }
        System.out.println(counter);
    }
}
