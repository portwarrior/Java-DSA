import java.util.Arrays;

public class Variableargs {
    public static void main(String[] args) {
        sum(1,2,3,5,45,6,5,6,5,2,12,6,3,241,5,2);
        sum2(1,2,"APPLE","A","V","AA");
    }

    //when we do not know how many arguments we wanna pass through a function we write (...v)
    //the ...v takes an array of integers below. If we would have said String ...v then it takes array of string
    static void sum(int ...v){
        System.out.println(Arrays.toString(v));
    }

    //if we have different types of arguments this is what we do
    static void sum2(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));
    }
}
