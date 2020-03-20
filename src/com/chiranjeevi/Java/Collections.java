package com.chiranjeevi.Java;

import javax.xml.bind.Element;
import java.util.*;

public class Collections {

    public static void main(String[] args) {

        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Maximum number of elements a List can have: ");
        n = sc.nextInt();
        List<Object> li = new ArrayList<>();
        System.out.println("Please Enter the Elements into the List: ");
        for(int i = 0; i < n; i++)
            li.add(sc.next());
        doCollections(li, n);
    }

    private static void doCollections(List<Object> li, int n) {
        HashMap<Integer, Object> hmap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            hmap.put(i, li.get(i));
        }
        HashSet<Object> hset = new HashSet<>(li);
        System.out.println("The List you Entered is "+li);
        System.out.println("The Hashmap is "+hmap);
        System.out.println("The Hashset with list is "+hset);
/*        Object str;
        for(int i  = 0; i < n; i++)
        {
            str = i + hmap.get(i);
        }*/
    }


}
