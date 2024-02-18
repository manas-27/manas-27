// package OOPs;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); 

        map.put("India", 140);
        map.put("USA", 80);
        map.put("China", 160);

        System.out.println(map);

        // Searcjh operation

        if(map.containsKey("China")){
            System.out.println("Key is present");
        }else{
            System.out.println("key is not present");
        }

        for (int value : map.values()) {
            System.out.println(value);
        }

        //Iteration in Hashmap

        for(Map.Entry<String, Integer> element: map.entrySet()){
            System.out.println(element.getKey() +" "+ element.getValue());
        }
    }
}
