package Ds.Achievers;

import java.util.Scanner;
import java.util.Stack;

public class PREFIX_TO_POSTFIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        String prefix = sc.next();
        StringBuilder postfix = new StringBuilder();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                String s1= (String) s.peek();
                s.pop();
                String s2= (String) s.peek();
                s.pop();
                String temp = s1+s2+prefix.charAt(i);
                s.push(temp);
            }
            else{
                s.push(prefix.charAt(i)+"");
            }
        }
        System.out.println("Postfix Expression is "+s.pop());
    }
}
