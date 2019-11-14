package DS.Achievers;

import java.util.Scanner;

public class REVERSE_ALPHA_STRING {
    public static void reverse(char[] arr){
        int start=0;
        int end=arr.length-1;
        char temp;
        while (start<end){
            if (!Character.isAlphabetic(arr[start]))
                start++;
            else if (!Character.isAlphabetic(arr[end]))
                end--;
            else {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String(alphabets and special characters)");
        String s=sc.next();
        char[] temp=s.toCharArray();
        reverse(temp);
        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"");
        }
    }
}
