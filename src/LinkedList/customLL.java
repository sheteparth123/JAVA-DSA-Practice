package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class customLL {

    static Node head=new Node(10);

    public static void main(String[] args) {


        addNodeAfter(head);
        addNodeAfter(head);
        addNodeAfter(head);
        addNodeAfter(head);
        printList(head);
//        Node newHead=addNodeBefore(head);
//        printList(newHead);
//        System.out.println();
//        Node newHead1=insertAtBeginning(10);
//        printList(newHead1);
//        System.out.println();
//        Node newHead2=insertAtSpecificPosition(300,1);
//        printList(newHead2);
//        Node newHead3=insertAtEnd(1000);
//        printList(newHead3);
//        deleteFromBeginning();
//        printList(head);
//        deleteAtPosition(3);
//        deleteFromEnd();
//        printList(head);
//            Node node=findNode(head,30);
//        System.out.println(node.data);
//        deleteGivenNode(node);
//        printList(head);
//        addCycle(head);
////        printCycle(head);
//        Node node1=detectCycle(head);
//        System.out.println(node1.data);
//        Node node2=detectFirstNode(head);
//        System.out.println(node2.data);
//        removeCycle(head);
//        printList(head);

//        Node newHead=reverse(head);
//        printList(newHead);

       boolean res= checkpallindromLL(head);
        System.out.println(res);




    }
    public static void addNodeAfter(Node head){
        Scanner sc=new Scanner(System.in);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println("Enter data for a adding after node");
        int data= sc.nextInt();
        Node newNode=new Node(data);
        temp.next=newNode;

    }
    public static Node addNodeBefore(Node head){
        Scanner sc=new Scanner(System.in);
        Node temp=head;
        System.out.println("Enter data for a adding before node");
        int data= sc.nextInt();
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return head;

    }
    public static Node insertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }
    public static Node insertAtSpecificPosition(int data,int position){
        Node newNode=new Node(data);
        Node temp=head;
        if(position==1){
            insertAtBeginning(data);
            return head;
        }
        for(int i=1;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("position out of bound");
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    public static Node insertAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
        return head;
    }
    static void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }
    static void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (position == 1) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of range.");
            return;
        }

        temp.next = temp.next.next;
    }
    static void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }


    private static Node findNode(Node node,int data){
        Node curr=node;
        while(curr!=null){
            if(curr.data==data) {
                return curr;
            }
            curr=curr.next;
        }
        return null;
    }

    private static void deleteLast(Node node){
        node=null;
    }
    private static void deleteGivenNode(Node node){
        node.data=node.next.data;
        Node temp=node.next;
        node.next=node.next.next;
        temp.next=null;

    }
    private static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        //        System.out.print(temp.data+"->");
        System.out.print("null");
        System.out.println();
    }
    public static void printCycle(Node head){
        Node temp=head;
        while(true){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public static void addCycle(Node head) {//infinte loop /cycle
        Node temp = head;
        while (temp.next != null) { // Stop at the last node
            temp = temp.next;
        }
        Node newNode = findNode(head, 30);
        if (newNode != null) { // Ensure newNode exists before linking
            temp.next = newNode;
        } else {
            System.out.println("Cycle node not found.");
        }
    }
    static Node detectCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }

        }
        return null;
    }
    static Node detectFirstNode(Node head){
        Node start=head;
        Node meet=detectCycle(head);
        while(start!=meet){
            start=start.next;
            meet=meet.next;
        }

        return start;
    }
    public static void removeCycle(Node head) {
        Node startNode = detectFirstNode(head);
        if (startNode == null) return; // No cycle

        Node temp = startNode;
        while (temp.next != startNode) { // Find the last node in the cycle
            temp = temp.next;
        }
        temp.next = null; // Break the cycle
        System.out.println("Cycle removed.");
    }
   public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
   }
   public static boolean checkpallindromLL(Node head){
        if(head==null){
            return true;
        }
        Node mid=middle(head);
        Node last=reverse(mid.next);
        Node curr=head;
        while(last!=null){
            if(last.data!=curr.data){
                return false;
            }
            curr=curr.next;
            last=last.next;
        }
        return true;

   }
   public static Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
   }

}
