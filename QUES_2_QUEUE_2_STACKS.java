package DS.Achievers;

import java.util.Scanner;
import java.util.Stack;

public class QUES_2_QUEUE_2_STACKS {
    static Stack<Object> s1=new Stack<>();
    static Stack<Object> s2=new Stack<>();
    static void enQueue(int key){
        while (!s1.isEmpty())
            s2.push(s1.pop());
        s1.push(key);
        while (!s2.isEmpty())
            s1.push(s2.pop());
    }
    static Object deQueue(){
        if (s1.isEmpty())
            System.out.println("Empty");
        Object temp=s1.peek();
        s1.pop();
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QUES_2_QUEUE_2_STACKS queue=new QUES_2_QUEUE_2_STACKS();
        System.out.println("Enter key to insert");
        int key=sc.nextInt();
        while (key!=-1){
            enQueue(key);
            System.out.println("Enter again");
            key=sc.nextInt();
        }
        System.out.println(s1);
        System.out.println(deQueue());
        System.out.println(s1);
    }
}
