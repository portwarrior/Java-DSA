// Class to demonstrate shadowing in Java
public class Shadowing {
    static int x=10; // Static variable x with initial value 10

    // Main method
    public static void main(String[] args) {
        System.out.println(x); // Print the value of x
        thiss(); // Call the thiss() method
    }

    // Method to explain shadowing
    static void thiss(){
        int x = 5; // Local variable x with value 5, shadowing the static variable x
        System.out.println("Shadowed x: " + x); // Print the value of the shadowed x
        System.out.println("Static x: " + Shadowing.x); // Print the value of the static x
    }
}
