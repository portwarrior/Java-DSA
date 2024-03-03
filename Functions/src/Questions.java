import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int i=in.nextInt();

        boolean ans=isPrime(i);
        System.out.println(ans);
        in.close();
    }

        static boolean isPrime(int x){
            if(x<=1){
                return false;
            }
            int c=2;
            while (c*c<=x) {
                if(x%c==0){
                    return false;
                }
                c++;
            }
            return c*c> x;
        }
    }
