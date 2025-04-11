package BST;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left=this.right=null;
    }
}
public class BinarySearchTree {
    TreeNode root;
    public static TreeNode insert(TreeNode root,int ele){
        if(root==null){
            return new TreeNode(ele);
        }
        if(ele<root.val){
            root.left=insert(root.left,ele);

        }
        else{
            root.right=insert(root.right,ele);
        }
        return root;
    }
    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.val+" ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree  bst=new BinarySearchTree();
        int arr[]={4,2,7,1,3};
        for(int val:arr){
            bst.root=insert(bst.root,val);
        }
        //insert 5
        bst.insert(bst.root,5);
        System.out.println("Inorder of bst");
        bst.inorder(bst.root);
    }
}
