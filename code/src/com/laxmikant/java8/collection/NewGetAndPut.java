package com.laxmikant.java8.collection;

import java.util.HashMap;
import java.util.Map;
//get rid of nasty ifelse
public class NewGetAndPut {

    public static void main(String[] args) {

        Map<String, Integer> authers = new HashMap<>();
        authers.put("Martin Fowler", 27);
        authers.put("Robert Martin", 50);
        authers.put("Shekhar gulati", 17);

        /*
         * Problem statement: How would put a value to a key only if the key is absent.
         */

        // Java 7
        Integer v = authers.get("Laxmikant");
        if (v == null)
            authers.put("Laxmikant", 1);
        System.out.println(authers);

        // java 8
        authers.putIfAbsent("Laxmikant", 2);
        System.out.println(authers);

        /*
         * Problem statement: How would get a default value if the key is missing in the
         * map.
         */
        // java 7
        Integer books = authers.get("xyz");
        books = books == null ? 0 : books;
        System.out.println(books);
       
        // java 8
        books = authers.getOrDefault("xyz", 0);
        System.out.println(books);

    }
}
