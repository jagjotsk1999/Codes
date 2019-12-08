package Ds.Achievers;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of first array");
        int size1 = sc.nextInt();
        System.out.println("enter the elements");
        int[] array1 = new int[size1];
        for (int i = 0 ; i < size1 ; i++){
            array1[i] = sc.nextInt();
        }
        System.out.println("enter size of second array");
        int size2 = sc.nextInt();
        System.out.println("enter the elements");
        int[] array2 = new int[size2];
        for (int i = 0 ; i < size2 ; i++){
            array2[i] = sc.nextInt();
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        int[] array3 = new int[size1 + size2];
        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2){
            if (array1[i] < array2[j]) {
                array3[k] = array1[i];
                k++;
                i++;
            }
            else {
                array3[k] = array2[j];
                k++;
                j++;
            }
        }
        while (i < size1){
            array3[k] = array1[i];
            k++;
            i++;
        }
        while (j < size2){
            array3[k] = array2[j];
            k++;
            j++;
        }
        System.out.println("array after merging is");
        for (i = 0 ; i < size1 + size2 ; i++){
            System.out.print(array3[i]+" ");
        }
    }
}
