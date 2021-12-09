package javadsa.array;

import java.util.*;

public class arraylist {
    static void printArray() {
        ArrayList<Integer> a = new ArrayList();
        ArrayList<String> s = new ArrayList();
        a.add(1);
        a.add(34);
        a.add(23);
        a.add(56);
        s.add("Mango");
        s.add("Apple");
        System.out.println(a);
        System.out.println(s);
        a.remove(2);
        s.remove("Apple");
        System.out.println(a);
        System.out.println(s);

    }

    public static void main(String[] args) {

        printArray();
    }
}
