package Ds.Achievers;

import java.util.Scanner;

public class AddWithoutPlusOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while (num2 != 0){
            int carry = num1 & num2;
            num1 = num1 ^ num2;
            num2 = carry << 1;
        }
        System.out.println("the sum is: "+num1);
    }
}
