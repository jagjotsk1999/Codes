package Ds.Achievers;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
        System.out.println("how many entries to make?");
        int size=sc.nextInt();
        for (int i=0;i<size;i++){
            String name=sc.next();
            int number=sc.nextInt();
            hashMap.put(number, name);
        }
        System.out.println("enter name to get the phone number(-1 to exit)");
        String nameSearch=sc.next();
        System.out.println(hashMap.containsValue(nameSearch));
            for (int o : hashMap.keySet()) {
                if (hashMap.get(o).equals(nameSearch))
                    System.out.println(nameSearch + "=" + o);
            }
    }
}
