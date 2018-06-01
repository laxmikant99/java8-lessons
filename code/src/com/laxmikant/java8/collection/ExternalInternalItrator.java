package com.laxmikant.java8.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*# External vs Internal Iterator pattern
Problem statement: How would you iterate over a Collection ?*/
public class ExternalInternalItrator {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 5);
        // java 7 approach 1 : external : problem is changes of error is high
        for (int i = 0; i < numbers.size(); i++)
            System.out.println(numbers.get(i));

        // java 7 approach 2 : for each loop a syntactic sugar, external
        for (int i : numbers) {
            System.out.println(i);
        }

        // java 8 approach 1 : for each loop inernal iterator
        numbers.forEach(n -> System.out.println(n));

        // java 8 approach 2 : for each loop inernal iterator
        numbers.forEach(System.out::println);
       
        /////////////////////////////////////////////////////////////////////////////////////
        Map<String, Integer> authers = new HashMap<>();
        authers.put("Martin Fowler", 27);
        authers.put("Robert Martin", 50);
        authers.put("Shekhar gulati", 17);   
        
        // java 7 approach for map
        Set<Entry<String, Integer>> entries = authers.entrySet();
        for(Entry<String, Integer> e : entries) {
            System.out.println(e.getKey() + " wrote " + e.getValue() + " books");    
        }
        // java 8 approach with BiConsumer in map
        authers.forEach((a, b) -> System.out.println(a + " wrote " + b + " books"));
        

    }

}
