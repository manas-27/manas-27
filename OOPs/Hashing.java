package OOPs;

import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // search

        if(set.contains(1)){
            System.out.println("It contains 1");
        }

        if(!set.contains(6)){
            System.out.println("Does not contain 6");
        }

        set.remove(2);

        if(!set.contains(2)){
            System.out.println("2 is deleted");
        }

        // to print all elements

        System.out.println(set);

        // size of set

        System.out.println(set.size());

        // Iterator for set traversing

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
            
        
    }
}
