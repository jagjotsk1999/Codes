package Ds.Achievers;

import java.util.Scanner;

public class HighestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int[] factors=new int[10];
        int j=0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                factors[j] = i;
                j++;
            }
        }
        for (int i=0;i<factors.length;i++){
            if (factors[i] != 0) {
                for (int k=2;k<=factors[i]/2;k++){
                    if (factors[i] % k == 0){
                        factors[i]=0;
                        break;
                    }
                }
            }
        }
        int max=factors[0];
        for (int factor : factors) {
            if (max < factor) {
                max = factor;
            }
        }
        System.out.println(max);
    }
}
