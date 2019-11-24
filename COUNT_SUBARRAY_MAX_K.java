package Ds.Achievers;

import java.util.Scanner;

public class COUNT_SUBARRAY_MAX_K {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k=sc.nextInt();

        int temp=0;//to store the sub-arrays with max greater than k
        int i=0;
        int count=0;
        int total=((size*(size+1))/2);
        while (i<size){
            if (arr[i]>k){
                i++;
//                these elements are not required
                continue;
            }
//            count=0;
            while (i<size && arr[i]<=k){
                count++;
                i++;
            }
            temp=temp+((count*(count+1))/2);
        }
        System.out.println(total-temp);
    }
}
