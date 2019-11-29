package Ds.Achievers;

class Node1{
    int data;
    Node1 left;
    Node1 right;
    Node1(int temp){
        data=temp;
        left=right=null;
    }
}
public class LeftViewBinaryTree {
    static Node1 root;
    static int levelMax=0;
    public void leftView(){
        leftView(root, 1);
    }
    public void leftView(Node1 temp, int level){
        if (temp==null)
            return;
        if (levelMax<level){
            System.out.print(temp.data+" ");
            levelMax=level;
        }
        leftView(temp.left, level+1);
        leftView(temp.right, level+1);
    }

    public static void main(String[] args) {
        LeftViewBinaryTree tree=new LeftViewBinaryTree();
        root=new Node1(10);
        root.left=new Node1(20);
        root.right=new Node1(30);
        root.left.left=new Node1(40);
        root.left.right=new Node1(50);
        root.left.right.left=new Node1(70);
        root.left.right.left.right=new Node1(80);
        root.right.right=new Node1(60);
        tree.leftView();
    }
}
