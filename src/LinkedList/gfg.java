package LinkedList;

public class gfg {
    public static class node {
        int data;
        node next, child;

        public node(int data) {
            this.data = data;
            this.next = null;
            this.child = null;
        }
    }

    public static node head;


    public static void function(node head) {
        node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        node temp1 = head;
        while (temp1 != null) {

            if (temp1.child != null) {

                temp.next = temp1.child;


                node temp2 = temp1.child;
                while (temp2.next != null) {
                    temp2 = temp2.next;
                }

                temp = temp2;

                temp1.child = null;
            }

            temp1 = temp1.next;
        }
    }

    // Function to print the linked list
    public static void print(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        gfg LL = new gfg();
        LL.head = new node(1);
        LL.head.next = new node(2);
        LL.head.next.next = new node(3);
        LL.head.child = new node(4);
        LL.head.next.child = new node(5);
        LL.head.next.next.child = new node(6);
        LL.head.child.child = new node(7);
        LL.head.next.child.child = new node(8);
        LL.head.child.child.child=new node(1);

        LL.function(head);
        LL.print(head);
    }
}
