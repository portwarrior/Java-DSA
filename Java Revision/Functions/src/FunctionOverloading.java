import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        sum("args");
        sum(0);
    }
    //when 2 functions exist with the same name then they must have different arguments. 
    //Say the first function takes the argument int a then the second function must take the arguments int b,String c etc.
    static void sum(int a){
        System.out.println(a);
    }

    static void sum(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
