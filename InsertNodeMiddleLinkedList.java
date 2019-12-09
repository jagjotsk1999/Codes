package Ds.Achievers;

import java.util.Scanner;

public class InsertNodeMiddleLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    InsertNodeMiddleLinkedList add(InsertNodeMiddleLinkedList list, int data){
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
        return list;
    }
    void display(){
        Node ptr = head;
        while (ptr != null){
            System.out.print(ptr.data+" --> ");
            ptr = ptr.next;
        }
    }
    void insertAtMiddle(int data){
        if (head == null)
            head = new Node(data);
        else {
            Node newNode = new Node(data);
            Node ptr = head;
            int length = 0;
            while (ptr != null){
                length++;
                ptr = ptr.next;
            }
            int position = 0;
            if (length % 2 == 0)
                position = length / 2;
            else
                position = (length + 1) / 2;
            ptr = head;
            while (position > 1){
                ptr = ptr.next;
                position--;
            }
            newNode.next = ptr.next;
            ptr.next = newNode;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertNodeMiddleLinkedList list = new InsertNodeMiddleLinkedList();
        System.out.println("enter elements to insert(-1 to exit)");
        int element = sc.nextInt();
        while (element != -1){
            list.add(list, element);
            element = sc.nextInt();
        }
        System.out.println("created linked list is: ");
        list.display();
        System.out.print("null");
        System.out.println("\nenter element to insert in middle");
        int middle = sc.nextInt();
        list.insertAtMiddle(middle);
        System.out.println("created linked list is: ");
        list.display();
        System.out.print("null");
    }
}
