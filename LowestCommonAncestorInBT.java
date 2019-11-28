package Ds.Achievers;

import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    Node(int temp){
        data=temp;
        left=right=null;
    }
}
public class LowestCommonAncestorInBT {
    static Node root;
    Node checklca(int value1, int value2){
        return checklca(root, value1, value2);
    }
    Node checklca(Node root, int value1, int value2){
        if (root==null)
            return null;
        if (root.data==value1 || root.data==value2)
            return root;
        Node left=checklca(root.left, value1, value2);
        Node right=checklca(root.right, value1, value2);
        if (left!=null && right!=null)
            return root;
        return (left!=null)?left:right;
    }

    public static void main(String[] args) {
        LowestCommonAncestorInBT tree=new LowestCommonAncestorInBT();
        Scanner sc=new Scanner(System.in);
        root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        System.out.println("Enter the two nodes to find their LCA(-1 to exit)");
        int value1=sc.nextInt();
        int value2=sc.nextInt();
        while (value1!=-1 && value2!=-1){
            System.out.println(tree.checklca(value1, value2).data);
            value1=sc.nextInt();
            value2=sc.nextInt();
        }
    }
}
