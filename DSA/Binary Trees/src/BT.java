import java.util.Scanner;

public class BT {
    

    private static class Node{
        private int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the number you wish to enter in the Binary tree: ");
        int x=scanner.nextInt();
        root=new Node(x);
        populate(scanner,root);
    }

    private void populate(Scanner scanner,Node node){
        System.out.println("Do you wanna enter left of "+node.value);
        boolean left=scanner.nextBoolean();

        if(left){
            System.out.println("Enter the value: ");
            int leftval=scanner.nextInt();
            node.left=new Node(leftval);
            populate(scanner,node.left);
        }

        System.out.println("Do you wanna enter right of "+node.value);
        boolean right=scanner.nextBoolean();

        if(right){
            System.out.println("Enter the value: ");
            int rightval=scanner.nextInt();
            node.right=new Node(rightval);
            populate(scanner,node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indenting) {
        if (node == null) {
            return;
        }
        System.err.println(indenting + node.value);
        display(node.left, indenting + "  ");
        display(node.right, indenting + "  ");
    }
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        BT tree=new BT();
        tree.populate(x);
        tree.display();
    }
}
