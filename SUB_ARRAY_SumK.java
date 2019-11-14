package DS;

import java.util.Scanner;

public class SUB_ARRAY_SumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0, count = 0;
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int ksum = sc.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total = 0;
            for (int j = i; j < n; j++) {
                total = total + arr[j];
                if (total == ksum) {
                    int p = j;
                    System.out.println(ksum + "->[" + i + "," + p + "]");
                }
                if (total > ksum || n == j) {
                    break;
                }
            }
        }
    }
}