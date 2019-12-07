package Ds.Achievers;

public class BinaryTreeMirror {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    static Node root;
    boolean ismirror(){
        return isMirror(root, root);
    }
    boolean isMirror(Node node1, Node node2){
        if (node1 == null && node2 == null)
            return true;
        if (node1 != null && node2 != null && node1.data == node2.data)
            return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
        return false;
    }

    public static void main(String[] args) {
        BinaryTreeMirror tree = new BinaryTreeMirror();
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(20);
        root.left.left = new Node(30);
        root.right.left = new Node(40);
        root.left.right = new Node(40);
        root.right.right = new Node(30);
        if (tree.ismirror())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
