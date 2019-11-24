package Ds.Achievers;

import java.util.Scanner;

public class DOUBLY_LINKED_LIST_REVERSE {
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            data=d;
            prev=next=null;
        }
    }
    //    FUNCTION TO ADD NODE AT THE BEGINNING
    public void push(int data){
//        creating a new node
        Node newNode=new Node(data);
//        changing links for newNode
        newNode.next=head;
        newNode.prev=null;
//        changing head.prev to point newNode
        if (head!=null)
            head.prev=newNode;
//        newNode now becomes the head
        head=newNode;
    }
    //    FUNCTION TO ADD NODE AT THE END
    public void append(int data){
//        creating a new node
        Node newNode=new Node(data);
//        storing head
        Node last=head;
//        if list is empty then newNode is head
        if (head==null){
            newNode.prev=null;
            head=newNode;
            return;
        }
//        else traverse until null is received
        while (last.next!=null)
            last=last.next;
//        changing next of last node
        last.next=newNode;
//        changing prev of newNode
        newNode.prev=last;
    }
    public void insertAfter(Node prev, int data){
        if (prev==null){
            System.out.println("Not Possible");
            return;
        }
//        creating a new node
        Node newNode=new Node(data);
//        changing links
        newNode.next=prev.next;
        prev.next=newNode;
        newNode.prev=prev;
        if (newNode.next!=null)
            newNode.next.prev=newNode;
    }
    public void display(Node node){
        Node last=null;
        System.out.println("Printing in forward direction");
        while (node!=null){
            System.out.print(node.data+" ");
            last=node;
            node=node.next;
        }
        System.out.println();
//        System.out.println("Printing in backward direction");
//        while (last!=null){
//            System.out.print(last.data+" ");
//            last=last.prev;
//        }
    }
    public void reverse(){
        Node temp=null;
        Node present=head;
        while (present!=null){
            temp=present.prev;
            present.prev=present.next;
            present.next=temp;
            present=present.prev;
        }
        if (temp!=null)
            head=temp.prev;
    }
    public static void main(String[] args) {
        DOUBLY_LINKED_LIST_REVERSE dll=new DOUBLY_LINKED_LIST_REVERSE();
        Scanner sc=new Scanner(System.in);
        System.out.println("***DOUBLY LINKED LIST MENU***\n1. ADD AT THE BEGINNING\n" +
                "2. ADD AT THE END\n3. DISPLAY\n4. REVERSE\n***-1 to exit***");
        int choice=sc.nextInt();
        while (choice!=-1) {
            switch (choice) {
                case 1:
                    System.out.println("***INSERTION AT THE BEGINNING***");
                    System.out.println("Enter the data(-1 to exit)");
                    int data = sc.nextInt();
                    while (data != -1) {
                        dll.push(data);
                        data = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("***INSERTION AT THE END***");
                    System.out.println("Enter the data(-1 to exit)");
                    data = sc.nextInt();
                    while (data != -1) {
                        dll.append(data);
                        data = sc.nextInt();
                    }
                    break;
                case 3:
                    dll.display(dll.head);
                    break;
                case 4:
                    dll.reverse();
                    break;
                default:
                    System.out.println("Wrong input! Enter again");
            }
            choice=sc.nextInt();
        }
//        dll.insertAfter(dll.head.next, 8);
    }
}
