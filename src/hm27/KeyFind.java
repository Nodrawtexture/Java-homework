package hm27;

import java.util.*;

public class KeyFind {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Apple");
        states.put(2, "Orange");
        states.put(3, "Banana");
        states.put(4, "Pear");

        for(Map.Entry<Integer, String> item : states.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        states.remove(3);
        System.out.println("");

        for(Map.Entry<Integer, String> item : states.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
    }
}
