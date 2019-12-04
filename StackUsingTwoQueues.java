package Ds.Achievers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingTwoQueues {
    static Queue<Integer> queue1=new LinkedList<Integer>();
    static Queue<Integer> queue2=new LinkedList<Integer>();
    void push(int element){
        queue2.add(element);
        while (!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    void pop(){
        if (queue1.isEmpty())
            return;
        System.out.println("Removed element is: "+queue1.remove());
    }
    public static void main(String[] args) {
        StackUsingTwoQueues stack =new StackUsingTwoQueues();
        Scanner sc=new Scanner(System.in);
        System.out.println("***STACK***\n1. Push\n2. Pop\n-1 to exit");
        int choice=sc.nextInt();
        int element=0;
        while (choice!=-1){
            switch (choice){
                case 1:
                    System.out.println("Enter element to insert(-1 to exit)");
                    element=sc.nextInt();
                    while (element!=-1){
                        stack.push(element);
                        System.out.println("Enter again");
                        element=sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Deleting");
                    stack.pop();
                    break;
                default:
                    System.out.println("Wrong input! enter again");
                    break;
            }
            choice=sc.nextInt();
        }
    }
}
