package conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Please press X or x to stop");
        System.out.println("Enter the operation you wish like + - * / %");
        Scanner in=new Scanner(System.in);

        int ans=0;
        while(true){
            char op=in.next().trim().charAt(0);
            if(op=='+' || op=='*' || op=='-' || op=='/' || op=='%'){
                System.out.println("Enter a number");
                int num1=in.nextInt();
                System.out.println("Enter another number");
                int num2=in.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='%'){
                    ans=num1%num2;
                }
                if(op=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                    
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                else if(op=='x' || op =='X'){
                    break;
                }
                System.out.println(ans);
            }
            
        }
    }
}
