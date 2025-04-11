package Tree;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
//            this.left=null;
//            this.right=null;
            left=right=null;
        }
    }
    Node root;

    public static void main(String[] args) {
       BinaryTree bt=new BinaryTree();
       bt.createBinaryTree();
       bt.print(bt.root);
    }
    void createBinaryTree()
    {
        root=new Node(50);
        root.left=new Node(25);
        root.right=new Node(55);
        root.left.left=new Node(33);
        root.left.right=new Node(44);
        root.right.left=new Node(95);
        root.right.right=new Node(62);
        root.left.right.left=new Node(11);

    }
    void print(Node root){
        if(root==null){
            return;
        }
        String left=(root.left!=null)? Integer.toString(root.left.data):"null";//ternary operator
        String right=(root.right!=null)? Integer.toString(root.right.data):"null";
        System.out.println(left+"--------> "+root.data+"<-------"+right);
//        System.out.println(root.data);
        print(root.left);
        print(root.right);

    }
}
