package DS;

import java.util.Scanner;

public class SUB_ARRAY_SumK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0,count=0;
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int ksum=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                for (int k=i;k<=j;k++){
//                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                if (sum==ksum)
                    count++;
                sum=0;
//                System.out.println();
            }
        }
        System.out.println(count);
//        System.out.println(sum);
    }
}
