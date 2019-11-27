package Ds.Achievers;

import java.util.Scanner;
import java.util.Stack;

public class STRING_REMOVE_ADJACENT_DUP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=sc.next();
        String output="";
        if (input.charAt(0)!=input.charAt(1))
            output=output+input.charAt(0);
        for (int i=1;i<input.length()-1;i++){
            if (input.charAt(i)!=input.charAt(i-1) && input.charAt(i)!=input.charAt(i+1))
                output=output+input.charAt(i);
        }
        if (input.charAt(input.length()-1)!=input.charAt(input.length()-2))
            output=output+input.charAt(input.length()-1);
        System.out.println("The output string is: "+output);
    }
}
