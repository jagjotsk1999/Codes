package Ds.Achievers;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrayMinimumDifference {
    static int minDiff(int[] arr, int n, int noOfStudents){
//        n=length of array and number of packets
        if (n==0 || noOfStudents==0)
            System.out.println("error");
        if (noOfStudents>n)
            System.out.println("number of students cant be more than number of packets");
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        int min=0, max=0;
        int first=0, last=noOfStudents-1;
        for (first=0;first+last<n;first++){
            int diff=arr[first+last]-arr[first];
            if (diff<minDiff){
                minDiff=diff;
                min=first;
                max=first+last;
            }
        }
        return arr[max]-arr[min];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number of students");
        int noOfStudents=sc.nextInt();
        int output=minDiff(arr, size, noOfStudents);
        System.out.println(output);
    }
}
