package com.laxmikant.java8.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveIf {
    /* Problem Statement : remove an element from list for a given condition */
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // java 7 approach : external while loop : problem too verbose and presence of boiler plate code
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            if (value.equals(3))
                // numbers.remove(value); //Failfast
                it.remove();
        }

        // java 8 approach : use removeIf
        numbers.removeIf(i -> i.equals(3));

    }

}
