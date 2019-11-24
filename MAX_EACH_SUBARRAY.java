package Ds.Achievers;

import java.util.Scanner;

public class MAX_EACH_SUBARRAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the size of sub-array");
        int k=sc.nextInt();
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        int max;
        for (int i=0;i<=size-k;i++){
            max=arr[i];
            for (temp=1;temp<k;temp++){
                if (max<arr[i+temp]) {
                    max = arr[i + temp];
                }
            }
            System.out.print(max+" ");
        }
    }
}
