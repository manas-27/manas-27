package javadsa.array;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    static void printArray() {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<String> s = new ArrayList<>();

        // adding element in ararylist
        a.add(1);
        a.add(34);
        a.add(23);
        a.add(56);
        s.add("Mango");
        s.add("Apple");
        System.out.println(a);
        System.out.println(s);

        // merging two arraylist --> datatype should be same for merging two lists
        // a.addAll(s);
        // System.out.println(a);

        // adding element in between
        a.add(1, 2);
        System.out.println(a);

        // to remove element from arraylist
        a.remove(4);
        System.out.println(a);

        // To sort element in the given arraylist
        Collections.sort(a);
        System.out.println(a);

        // To get particular element
        System.out.println(a.get(2));

        // To get the size of arraylist
        System.out.println(a.size());

    }

    public static void main(String[] args) {

        printArray();
    }
}
