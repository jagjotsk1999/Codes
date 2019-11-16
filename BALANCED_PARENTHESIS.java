package DS.Achievers;

import java.util.Scanner;

public class BALANCED_PARENTHESIS {
    static class stack {
        int top = -1;//meaning the stack is empty
        char[] arr = new char[50];//array to store with size 50

        public void push(char item) {
            if (top == 49)//meaning stack is full
                System.out.println("Stack Full");
            else {//push into stack
                arr[++top]=item;
            }
        }

        public char pop() {
            if (top == -1) {//meaning stack empty
                System.out.println("Stack Underflow");
                return '\0';
            } else {//return the popped element
                char p = arr[top];
                top--;
                return p;
            }
        }

        public boolean isEmpty() {
            if (top == -1)
                return true;
            else
                return false;
        }
    }
        public static boolean doesMatch(char c1, char c2){
            if (c1=='(' && c2==')')
                return true;
            else if (c1=='{' && c2=='}')
                return true;
            else if (c1=='[' && c2==']')
                return true;
            else
                return false;
        }
        public static boolean balParenthesis(char[] string){
            stack s=new stack();
            for (int i=0;i<string.length;i++){
                if (string[i]=='(' || string[i]=='{' || string[i]=='[')
                    s.push(string[i]);
                if (string[i]==')' || string[i]=='}' || string[i]==']'){
                    if (s.isEmpty())
//                        if ending bracket has no starting bracket(stack is empty) then return false
                        return false;
                    else if (!doesMatch(s.pop(), string[i])){
                        return false;
                    }
                }
            }
            if (s.isEmpty())
                return true;
            else
                return false;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string containing parenthesis");
        String s=sc.next();
        char[] arr=s.toCharArray();
        if (balParenthesis(arr))
            System.out.println("Parenthesis are Balanced");
        else
            System.out.println("Parenthesis are not Balanced");
    }
}
