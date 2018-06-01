package com.laxmikant.java8.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RemoveMap {
    /*
     * Problem Statement : removes the key only if its associated with the given
     * value
     */
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Martin Fowler", 27);
        map.put("Robert Martin", 50);
        map.put("Shekhar gulati", 17);

        // java 7
        if (map.containsKey("Martin Fowler") && Objects.equals(map.get("Martin Fowler"), 27)) {
            map.remove("Martin Fowler");
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(map);

        // java 8
        System.out.println(map.remove("Shekhar gulati", 17));
        System.out.println(map);
    }

}
