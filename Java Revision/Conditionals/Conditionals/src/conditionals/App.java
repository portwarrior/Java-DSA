package conditionals;
public class App {
    public static void main(String[] args) throws Exception {
        int salary =25600;
        if(salary>22000){
            salary=salary-2000;
            System.err.println(salary);
        }
        else{
            salary=salary+2000;
        }
        
        //loops
        //print numbers from one to 5
        for(int i=3;i<=5;i++){
            System.out.println(i);
        }

        int j=1;
        while(j<6){
            System.out.println(j);
            j++;
        }

        int n=7;
        do{
            n+=2;
            System.err.println(n);
        }
        while(n<21);
    }
}
