package com.laxmikant.java8.collection;

import java.util.HashMap;
import java.util.Map;

public class MapComputing {
    // Performing computation directly on the value of specific key of a map
    public static void main(String[] args) {

        Map<String, Integer> authers = new HashMap<>();
        authers.put("Martin Fowler", 27);
        authers.put("Robert Martin", 50);
        authers.put("Shekhar gulati", 17);

        /*
         * Problem statement: How would change a value of a corresponding key in a map ?
         */
        //in java7
        if (authers.containsKey("Martin Fowler")) {
            authers.put("Martin Fowler", authers.get("Martin Fowler") + 1);
        } else {
            authers.put("Martin Fowler", 1);
        }
        
        System.out.println(authers);
        
        authers.compute("Martin Fowler", (k, v) -> v = v + 1); //npe if absent
        System.out.println(authers);

        authers.compute("Laxmikant", (k, v) -> v = v == null ? 1 : v + 1);
        System.out.println(authers);
        
        // better use this if key is absent
        authers.computeIfAbsent("xyz", k -> compute(k)); //check doc for java 7
        System.out.println(authers);
     
        authers.computeIfAbsent("xyz", k -> 11);
        System.out.println(authers);
      
        // if only want to update if key is present
        authers.computeIfPresent("Martin Fowler", (k, v) -> v = v + 1);
        System.out.println(authers);

        // if only want to update if key is present
        authers.computeIfPresent("ppp", (k, v) -> v = v + 1); //check doc for java 7
        System.out.println(authers);
         
    }
    
    static int compute(String s) {
        System.out.println("computing a value for \""+s+'"');
        return s.length();
    }

}
