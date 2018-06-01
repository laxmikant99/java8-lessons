package com.laxmikant.java8.collection;

import java.util.HashMap;
import java.util.Map;

public class MapMerging {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Martin Fowler", 27);
        map.put("Robert Martin", 50);
        map.put("Shekhar gulati", 17);
        /*
         * Problem statement: If value to key does not exist then set a default value
         * else re-map the key after performing some computation on old value
         */
        // java 7
        Integer oldValue = map.get("xyz");
        
        Integer newValue = (oldValue == null) ? 1 : remappingFunction(oldValue, 1);
        
        if (newValue == null)
            map.remove("xyz");
        else
            map.put("xyz", newValue);
      
        // java 8
        map.merge("xyz", 1, (k, v) -> Integer.sum(k, v));
        System.out.println(map);

        // better use this if key is absent
        map.merge("xyz", 1, Integer::sum);
        System.out.println(map);
    }
    
    static Integer  remappingFunction(Integer oldValue,Integer value){
        return Integer.sum(oldValue, value);
    }

}
