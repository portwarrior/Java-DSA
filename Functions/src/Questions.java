import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int i=in.nextInt();
        //boolean ans=isPrime(i);
        //System.out.println(ans);
        System.out.println(isArmstrong(i));
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

        static int armstrong(int a){
            int sum=0;
            while(a>0){
                int x=a%10;
                int z=cube(x);
                sum+=z;
                a=a/10;
            }
            return sum;
        }

        static boolean isArmstrong(int a){
            if(a==armstrong(a)){
                return true;
            }
            return false;
        }
        static int cube(int l){
            return l*l*l;
        }
    }
