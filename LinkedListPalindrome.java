package Ds.Achievers;

import java.util.Scanner;
import java.util.Stack;

public class LinkedListPalindrome {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    static LinkedListPalindrome addbeg(LinkedListPalindrome list, int data){
        Node newNode=new Node(data);
        if (list.head==null)
            list.head=newNode;
        else {
            newNode.next=list.head;
            list.head=newNode;
        }
        return list;
    }
    static LinkedListPalindrome addend(LinkedListPalindrome list, int data){
        Node newNode=new Node(data);
        if (list.head==null)
            list.head=newNode;
        else {
            Node last=list.head;
            while (last.next!=null){
                last=last.next;
            }
            last.next=newNode;
        }
        return list;
    }
    static void display(LinkedListPalindrome list){
        Node ptr=list.head;
        while (ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
    static void isPalindrome(LinkedListPalindrome list){
        Stack<Integer> s=new Stack<Integer>();
        Node ptr=list.head;
        boolean isPalindrome=true;
        while (ptr!=null){
            s.push(ptr.data);
            ptr=ptr.next;
        }
        while (list.head!=null){
            int value=s.pop();
            if (list.head.data==value)
                isPalindrome=true;
            else {
                isPalindrome = false;
                break;
            }
            list.head=list.head.next;
        }
        if (isPalindrome)
            System.out.println("Yes the entered linked list is a palindrome");
        else
            System.out.println("No the entered linked list is not a palindrome");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedListPalindrome list=new LinkedListPalindrome();
        System.out.println("enter your choice to enter elements in the list\n1. add in the beginning\n" +
                "2. add at the end\n3. display(-1 to exit)");
        int element;
        int choice=sc.nextInt();
        while (choice!=-1){
            switch (choice){
                case 1:
                    System.out.println("adding in the beginning");
                    System.out.println("enter the element(-1 to exit)");
                    element=sc.nextInt();
                    while (element!=-1){
                        list.addbeg(list, element);
                        element=sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("adding in the end");
                    System.out.println("enter the element(-1 to exit)");
                    element=sc.nextInt();
                    while (element!=-1){
                        list.addend(list, element);
                        element=sc.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("* * * * *");
                    System.out.println("Created linked lists are:\nlist 1:");
                    list.display(list);
                    break;
                default:
                    System.out.println("wrong choice");
            }
            choice=sc.nextInt();
        }
        isPalindrome(list);
    }
}
