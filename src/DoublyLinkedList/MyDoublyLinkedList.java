package DoublyLinkedList;


import java.util.Scanner;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

}
public class  MyDoublyLinkedList {
    static Node head=new Node(1);
    static Node tail=new Node(5);
    public static void main(String[] args) {
        head.next = tail;
        tail.prev = head;
        addNodeAfterHead(head,tail);
        addNodeAfterHead(head,tail);
        addNodeAfterHead(head,tail);
//        Node newHead=addNodeBeforeHead(head,tail);
        addNodeAfterTail(head,tail);
        printDLL(head,tail);
//        printDLL(newHead,tail);
        addNodeBeforeTail(head,tail);
        printDLL(head,tail);
    }
    public static void addNodeAfterHead(Node head,Node tail){
        Node temp=head;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data to add after head");
        int data=sc.nextInt();
        Node newNode=new Node(data);
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        newNode.next=tail;
        tail.prev=newNode;

    }
    public static Node addNodeBeforeHead(Node head,Node tail) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to add before head");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;

    }
    public static void addNodeAfterTail(Node head,Node tail){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data to add after tail");
        int data=sc.nextInt();
        Node newNode=new Node(data);
        tail.next=newNode;
        newNode.prev=tail;
        newNode.next=null;

    }
    public static void addNodeBeforeTail(Node head,Node tail) {

        Node temp=tail;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data to add before tail");
        int data=sc.nextInt();
        Node newNode=new Node(data);
        while(temp.prev!=head){
            temp=temp.prev;
        }
        temp.prev=newNode;
        newNode.prev=head;
        head.next=newNode;
        newNode.next=temp;
    }
        public static void printDLL(Node head,Node tail){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;

        }
        System.out.print("null");

    }
}
