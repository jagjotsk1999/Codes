package DS.Achievers;

class Node{
    int data;
    Node left;
    Node right;
    Node(int temp){
        data=temp;
        left=right=null;
    }
}
public class BINARY_TREE_BST {
    public static boolean isBST(Node root, Node left, Node right){
        if (root==null)
            return true;//because empty tree is a BST
        if (left!=null && root.data<=left.data)
            return false;
        if (right!=null && root.data>=right.data)
            return false;
        return isBST(root.left, left, root) && isBST(root.right, root, right);
    }
    static Node root;
    public static void main(String[] args) {
        root=new Node(40);
        root.left=new Node(20);
        root.right=new Node(50);
        root.left.left=new Node(10);
        root.left.right=new Node(30);
        if (isBST(root, null, null))
            System.out.println("YES, a BST");
        else
            System.out.println("NO, Not a BST");
    }
}
