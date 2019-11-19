package DS.Achievers;

import java.util.Scanner;

public class ROTATE_LINKED_LIST {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static ROTATE_LINKED_LIST addbeg(ROTATE_LINKED_LIST l, int data){
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
    public static ROTATE_LINKED_LIST insert(ROTATE_LINKED_LIST l, int data){
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
    public static ROTATE_LINKED_LIST delete(ROTATE_LINKED_LIST l){
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
    public void display(ROTATE_LINKED_LIST l){
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
    public void rotate(int k){
        if (k==0)
            return;
        Node present=head;
        int count=2;
        while (count<=k && present!=null){
//            traversing until we get the required node k number of times
            present=present.next;
            count++;
        }
        if (present==null)
//            if node found is null then no rotation required
            return;
        Node reqNode=present;
        while (present.next!=null)
            present=present.next;
        present.next=head;
        head=reqNode.next;
        reqNode.next=null;
    }
    public static void main(String[] args) {
        ROTATE_LINKED_LIST l=new ROTATE_LINKED_LIST();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter linked list elements(-1 to exit)");
        int element=sc.nextInt();
        while (element!=-1){
            l.addbeg(l, element);
            element=sc.nextInt();
        }
        System.out.println("* * * * *");
        l.display(l);
        System.out.println("\nEnter how many times to rotate?");
        int k=sc.nextInt();
        l.rotate(k);
//        l.removeDup();
        System.out.println("\n* * * * *");
        l.display(l);
    }
}
