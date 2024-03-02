import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empID=in.nextInt();
        String department=in.next();


        switch(empID){
            case 1:
                System.out.println("This is 1");
                break;
            case 2:
                System.out.println("This is 2");
                break;
            case 3:
                System.out.println("This is 3");
                switch (department) {
                    case "HR":
                        System.out.println("Bhai naukri haath mein hai");
                        break;
                
                    default:
                        System.out.println("Finance");
                        break;
                }
        }
    }
}
