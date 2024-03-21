public class dll {
    public static void main(String[] args) {
        dll list=new dll();
        list.insertFirst(02);
        list.insertFirst(50);
        list.insertFirst(4);
        list.insertFirst(30);
        list.insertFirst(2);

        list.display();
        list.displayReverse();
        // System.out.println();
        System.out.print("No change will be noticed below.");
        list.addLast(15);//wont do anything as the code is commented
        list.addLast(12);//wont do anything as the code is commented
        list.display();

        list.insertLast(213);
        System.out.println();
        System.out.print("The next line prints function using the code that checks for head =null or not");
        list.display();
        list.displayReverse();

        Node node = list.head;
        while (node != null && node.val != 4) {
            node = node.next;
        }
        if (node != null) {
            list.addMiddle(node, 220);
            list.display();
        }
    }

    Node head;
    Node tail;

    public void insertFirst(int x){
        Node newNode=new Node(x);
        newNode.next=head;
        newNode.prev=null;
        if(head!=null){
            head.prev=newNode;
        }
    head=newNode;
    }

    public void display(){
        System.out.println();
        Node newNode=head;
        while(newNode!=null){
            System.out.print(newNode.val+ "-->");
            if(newNode.next==null){
                System.out.print(" End");
            }
            tail=newNode;
            newNode=newNode.next;
        }
        
    }
    

    public void addLast(int x){
        // Node newNodee=new Node(x);
        // tail.next=newNodee;
        // newNodee.prev=tail;
        // newNodee.next=null;
        // tail=newNodee;
    }

    public void addMiddle(Node x,int z){
        Node y=new Node(z);
        y.next=x.next;
        x.next=y;
        y.prev=x;
        if(y.next!=null){
            y.next.prev=y;
        }
    }

    public void insertLast(int y){
        Node x=new Node(y);
        if(head==null){
            head=x;
        }
        x.next=null;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=x;
        x.prev=tail;
        tail=x;
    }

    public void displayReverse(){
        System.out.println(" ");
        Node newNode=tail;
        while(newNode!=null){
            System.out.print(newNode.val+ "-->");
            if(newNode.prev==null){
                System.out.print(" Start");
            }
            newNode=newNode.prev;
        }
        System.out.println();
    }

    private class Node{
        int val;
        Node next=null;
        Node prev=null;

        Node(int s){
            this.val=s;
        }

        Node(int x,Node n,Node m){
            this.val=x;
            this.next=n;
            this.prev=m;
        }
    }
}
