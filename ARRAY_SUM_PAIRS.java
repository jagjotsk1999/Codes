package Ds.Achievers;

import java.util.Scanner;

public class ARRAY_SUM_PAIRS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter size of first array");
        int size_arr=sc.nextInt();
//        System.out.println("Enter size of second array");
        int size_brr=sc.nextInt();
//        System.out.println("Enter value of sum");
        int sum_val=sc.nextInt();
        int[] arr=new int[size_arr];
        int[] brr=new int[size_brr];
        for (int i=0;i<size_arr;i++){
            arr[i]=sc.nextInt();
        }
        for (int j=0;j<size_brr;j++){
            brr[j]=sc.nextInt();
        }
        for (int i=0;i<size_arr;i++){
            for (int j=0;j<size_brr;j++){
                if (arr[i]+brr[j]==sum_val){
                    System.out.println(arr[i]+" , "+brr[j]);
                    break;
                }
            }
        }
    }
}
