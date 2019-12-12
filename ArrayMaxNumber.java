package Ds.Achievers;

import java.util.*;

public class ArrayMaxNumber {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        System.out.println("enter number of elements");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0 ; i < size ; i++){
            vector.add(sc.next());
        }
        maxNumber(vector);
    }
    static void maxNumber(Vector<String> vector){
        Collections.sort(vector, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ab.compareTo(ba) > 0 ? -1 : 1;
            }
        });
        Iterator itr = vector.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
