package javadsa.array;

import java.util.*;

public class arraylist {
    static void printArray() {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> s = new ArrayList<>();
        a.add("1");
        a.add("34");
        a.add("23");
        a.add("56");
        s.add("Mango");
        s.add("Apple");
        System.out.println(a);
        System.out.println(s);
        a.addAll(s);
        System.out.println(a);

    }

    public static void main(String[] args) {

        printArray();
    }
}
