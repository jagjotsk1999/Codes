package DS.Achievers;

import java.util.Scanner;

public class QUES_1_REVERSE_LINKED_LIST {
    static  Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    static QUES_1_REVERSE_LINKED_LIST addBeg(QUES_1_REVERSE_LINKED_LIST temp, int d){
//        temp is an already created linked list
//        creating a new node
        Node newNode=new Node(d);
//        checking if linked list exists or not
        if (temp.head==null)
//            if head is null meaning no linked list available
//            so making head point to newly created node
            temp.head=newNode;
        else {
            newNode.next=temp.head;
            temp.head=newNode;
        }
        return temp;
    }
    static QUES_1_REVERSE_LINKED_LIST addEnd(QUES_1_REVERSE_LINKED_LIST temp, int d){
//        temp is an already created linked list
//        creating a new node
        Node newNode=new Node(d);
//        checking if linked list exists or not
        if (head==null)
//            if head is null meaning no linked list available
//            so making head point to newly created node
            head=newNode;
        else {
//            creating a reference variable for head to traverse
            Node last=head;
//            to insert at the end so traversing until null
            while (last.next!=null){
//                changing last until null is received
                last=last.next;
            }
            last.next=newNode;
        }
        return temp;
    }
    static QUES_1_REVERSE_LINKED_LIST delete(QUES_1_REVERSE_LINKED_LIST temp){
        if (head==null)
//            head is null meaning list is empty
            System.out.println("Empty List");
        else {
            Node ptr=head;
            while (ptr.next.next!=null){
//                traversing and removing pointers from nodes
                ptr=ptr.next;
            }
            ptr.next=null;
        }
        return temp;
    }
    void display(QUES_1_REVERSE_LINKED_LIST temp){
        Node ptr=temp.head;
        while (ptr.next!=null){
//            head is not null meaning list is not empty
            System.out.print(ptr.data+" ");
//            printing the data part and traversing the list
            ptr=ptr.next;
//            traversing links
        }
        System.out.print(ptr.data);
    }
    static Node reverse(Node temp){
        Node prev=null;
        Node present=temp;
        Node next=null;
        while (present!=null){
            next=present.next;
            present.next=prev;
            prev=present;
            present=next;
        }
        temp=prev;
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QUES_1_REVERSE_LINKED_LIST list=new QUES_1_REVERSE_LINKED_LIST();
        System.out.println("***LINKED LIST MENU***\n1. Add at the beginning\n2. Add at the end\n" +
                "3. Display\n4. Delete\n5. Reverse\n***-1 to exit");
        int choice=sc.nextInt();
        int element=0;
        while (choice!=-1){
            switch (choice){
                case 1:
                    System.out.println("Enter the element(-1 to exit)");
                    element=sc.nextInt();
                    while (element!=-1){
                        addBeg(list, element);
                        System.out.println("Enter next element");
                        element=sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Enter the element(-1 to exit)");
                    element=sc.nextInt();
                    while (element!=-1){
                        addEnd(list, element);
                        System.out.println("Enter next element");
                        element=sc.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("The created linked list is:");
                    list.display(list);
                    break;
                case 4:
                    System.out.println("Deleting the linked list:");
                    delete(list);
                    list.display(list);
                    break;
                case 5:
                    System.out.println("Linked list after reversing is:");
                    head=reverse(head);
                    list.display(list);
                    break;
                default:
                    System.out.println("Wrong input! Enter again");
            }
            choice=sc.nextInt();
        }
    }
}
