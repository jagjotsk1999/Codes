package DS.Arrays;

import java.util.Scanner;

//best case is n
//this program does in n*n
public class FREQ_OF_EACH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int[] arrfreq=new int[n];
//        boolean flag=false;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i]==arr[j]){
                    if (count>0)
                        arr[j]=-1;
                    count++;
                }
            }
            if (arr[i]>-1){
                System.out.println("FREQUENCY OF "+arr[i]+" is:\t "+count);
                arrfreq[i]=count;
            }
            count=0;
        }
//        for (int i=0;i<n;i++){
//            System.out.print(arrfreq[i]+" ");
//        }
    }
}
