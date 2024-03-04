package conditionals;

public class Reverse {
    public static void main(String[] args) {
        int a=112233;
        int x=0;
        while (a>0) {
            int last=a%10;
            x=(x*10)+last;
            a=a/10;
        }
        System.out.println(x);
    }
}
