package DS.Achievers;

import java.util.Scanner;

public class QUES_4_QUEUE {
    Node front, rear;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    QUES_4_QUEUE(){
        front=rear=null;
    }
    void enQueue(int d){
        Node newNode=new Node(d);
        if (rear==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    void deQueue(){
        if (front==null)
            System.out.println("Queue is empty");
        Node temp=front;
        front=front.next;
        System.out.println("Removed element is: "+temp.data);
    }
    void display(){
        if (front==null)
            System.out.println("Queue is empty");
        else {
            Node temp=front;
            while (temp.next!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print(temp.data);
        }
    }

    public static void main(String[] args) {
        QUES_4_QUEUE queue=new QUES_4_QUEUE();
        Scanner sc=new Scanner(System.in);
        System.out.println("***QUEUE***\n1. Insert\n2. Delete\n3. Display\n-1 to exit");
        int choice=sc.nextInt();
        int element=0;
        while (choice!=-1){
            switch (choice){
                case 1:
                    System.out.println("Enter element to insert(-1 to exit)");
                    element=sc.nextInt();
                    while (element!=-1){
                        queue.enQueue(element);
                        System.out.println("Enter again");
                        element=sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Deleting");
                    queue.deQueue();
                    break;
                case 3:
                    System.out.println("Display");
                    queue.display();
                    break;
                default:
                    System.out.println("Wrong input! enter again");
                    break;
            }
            choice=sc.nextInt();
        }
    }
}
