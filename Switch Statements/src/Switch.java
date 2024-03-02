import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();

        //the approach below is too repetitive
        // if(fruit.equals("Mango")){
        //     System.out.println("This is the king of fruits");
        // }
        // if(fruit.equals("Grape")){
        //     System.out.println("This is what makes wine");
        // }
        // if(fruit.equals("Pear")){
        //     System.out.println("This is a green colored fruit");
        // }
        // if(fruit.equals("Orange")){
        //     System.out.println("This is an orange colored fruit which has vitamin c");
        // }

        //So lets use switch cases

        // switch(fruit){
        //     case "mango":
        //         System.out.println("This is the king of fruits");
        //         break;
        //     case "grape":
        //         System.out.println("This is what makes wine");
        //         break;
        //     case "pear":
        //         System.out.println("This is a green colored fruit");
        //         break;
        //     case "orange": 
        //         System.out.println("This is an orange colored fruit which has vitamin c");
        //         break;
        //     default:
        //     System.out.println("Enter a valid fruit");
        // }

            //enhanced switch below
            switch(fruit){
                case "mango" -> System.out.println("This is the king of fruits");
                case "grape" -> System.out.println("This is what makes wine");
                case "pear" -> System.out.println("This is a green colored fruit");
                case "orange" -> System.out.println("This is an orange colored fruit which has vitamin c");
                default -> System.out.println("Enter a valid fruit");
            }
            //-----------------------------------------------------------------------------------------------    
            //days
            int day=in.nextInt();

            switch(day){
                case 1:                    
                case 2:                    
                case 3:                    
                case 4:
                    System.out.println("Weekday");
                    break;
                case 5:                  
                case 6:
                case 7:
                    System.out.println("Weekend");
                    break;
            }
            //the above code and the code below have the same functionality 
            // switch(day){
            //     case 1, 2, 3, 4 -> System.out.println("Weekday");
            //     case 5, 6, 7 -> System.out.println("Weekend");
            // }
    }
}