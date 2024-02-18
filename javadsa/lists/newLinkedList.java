package lists;

import java.util.*;
public class newLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Manas");
        list.addLast("Tiwari");
        list.addFirst("Achyut");

        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println("Null");

        list.remove(1);

        System.out.println(list);
    }
}
