package Ds.Achievers;

import java.util.Scanner;

public class SumList {
    Node head;
    static int length=0;
    static  class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static SumList addbeg(SumList list, int data){
        Node newNode=new Node(data);
        if (list.head==null)
            list.head=newNode;
        else {
            newNode.next=list.head;
            list.head=newNode;
        }
        return list;
    }
    public static SumList addend(SumList list, int data){
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
    public static int display(SumList list){
        length=0;
        Node ptr=list.head;
        while (ptr!=null){
            System.out.print(ptr.data+" -> ");
            ptr=ptr.next;
            length++;
        }
        return length;
    }
    public static int calculateSum(SumList list1, SumList list2){
        String num1="";
            Node ptr=list1.head;
            while (ptr!=null){
                num1=num1+ptr.data;
                ptr=ptr.next;
            }
        System.out.println("number 1 is: "+num1);
        String num2="";
            Node ptr1=list2.head;
            while (ptr1!=null){
                num2=num2+ptr1.data;
                ptr1=ptr1.next;
            }
        System.out.println("number 2 is: "+num2);
            int sum=Integer.parseInt(num1)+Integer.parseInt(num2);
//        System.out.println("sum is: "+sum);
        return sum;
    }

    public static void main(String[] args) {
        SumList list1=new SumList();
        SumList list2=new SumList();
        SumList sumList=new SumList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter linked list elements for first list");
        int element;
        System.out.println("Enter choice:\n1. add at the beginning\n2. add at the end\n**-1 to exit**");
        int choice=sc.nextInt();
        while (choice!=-1){
            switch (choice){
                case 1:
                    System.out.println("add at the beginning\nenter the element(-1 to exit)");
                    element=sc.nextInt();
                    while (element!=-1) {
                        list1.addbeg(list1, element);
                        element = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("add at the end\nenter the element(-1 to exit)");
                    element=sc.nextInt();
                    while (element!=-1) {
                        list1.addbeg(list1, element);
                        element = sc.nextInt();
                    }
                    break;
                default:
                    System.out.println("Wrong choice! enter again");
            }
            choice=sc.nextInt();
        }
        System.out.println("Enter linked list elements for second list");
        System.out.println("Enter choice:\n1. add at the beginning\n2. add at the end\n**-1 to exit**");
        choice=sc.nextInt();
        while (choice!=-1){
            switch (choice){
                case 1:
                    System.out.println("add at the beginning\nenter the element(-1 to exit)");
                    element=sc.nextInt();
                    while (element!=-1) {
                        list2.addbeg(list2, element);
                        element = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("add at the end\nenter the element(-1 to exit)");
                    element=sc.nextInt();
                    while (element!=-1) {
                        list2.addbeg(list2, element);
                        element = sc.nextInt();
                    }
                    break;
                default:
                    System.out.println("Wrong choice! enter again");
            }
            choice=sc.nextInt();
        }
        System.out.println("* * * * *");
        System.out.println("Created linked lists are:\nlist 1:");
        int length1=list1.display(list1);
        System.out.print("null");
        System.out.println("\nlength of first list is: "+length1);
        System.out.println("\nlist 2:");
        int length2=list2.display(list2);
        System.out.print("null");
        System.out.println("\nlength of second list is: "+length2);
        int sum=calculateSum(list1, list2);
        while (sum>0){
            int rem=sum%10;
            sumList.addend(sumList, rem);
            sum=sum/10;
        }
        System.out.println("* * * * *");
        System.out.println("Created SumList is: ");
        sumList.display(sumList);
        System.out.println("null");
    }
}
