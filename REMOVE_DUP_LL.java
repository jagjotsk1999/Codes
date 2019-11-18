package DS.Achievers;

import java.util.Scanner;

public class REMOVE_DUP_LL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static REMOVE_DUP_LL addbeg(REMOVE_DUP_LL l, int data){
//        l is an already created linked list
//        creating a new node
        Node newNode= new Node(data);
//        safe side measure
        newNode.next=null;
//        checking if linked list exists or not
        if (l.head==null){
//            if head is null meaning no linked list available
//            so making head point to newly created node
            l.head=newNode;
        }
        else{
            newNode.next=l.head;
            l.head=newNode;
        }
        return l;
    }
    public static REMOVE_DUP_LL insert(REMOVE_DUP_LL l, int data){
//        l is an already created linked list
//        creating a new node
        Node newNode= new Node(data);
//        safe side measure
        newNode.next=null;
//        checking if linked list exists or not
        if (l.head==null){
//            if head is null meaning no linked list available
//            so making head point to newly created node
            l.head=newNode;
        }
        else {
//            creating a reference variable for head to traverse
            Node last=l.head;
//            to insert at the end so traversing until null
            while (last.next!=null){
//                changing last until null is received
                last=last.next;
            }
            last.next=newNode;
        }
        return l;
    }
    public static REMOVE_DUP_LL delete(REMOVE_DUP_LL l){
        if (l.head==null){
//            head is null meaning list is empty
            System.out.println("Empty");
        }
        else {
            Node ptr=l.head;
            while (ptr.next.next!=null){
//                traversing and removing pointers from nodes
                ptr=ptr.next;
            }
            ptr.next=null;
        }
        return l;
    }
    public void display(REMOVE_DUP_LL l){
        Node ptr=l.head;
        while (ptr!=null){
//            head is not null meaning list is not empty
            System.out.print(ptr.data+" ");
//            printing the data part and traversing the list
            ptr=ptr.next;
//            traversing links
        }
    }
    public void removeDup(){
        Node one=null;
        Node two=null;
        Node dup=null;
        one=head;
        while (one!=null && one.next!=null){
            two=one;
            while (two.next!=null){
                if (one.data==two.next.data){
                    dup=two.next;
                    two.next=two.next.next;
                }
                else {
                    two=two.next;
                }
            }
            one=one.next;
        }
    }
    public static void main(String[] args) {
        REMOVE_DUP_LL l=new REMOVE_DUP_LL();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter linked list elements(-1 to exit)");
        int element=sc.nextInt();
        while (element!=-1){
            l.addbeg(l, element);
            element=sc.nextInt();
        }
        System.out.println("* * * * *");
        l.display(l);
        System.out.println("\n* * * * *");
        l.removeDup();
        l.display(l);
    }
}
