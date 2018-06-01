package com.laxmikant.java8.collection;

import java.util.HashMap;
import java.util.Map;

public class MapReplace {
    
public static void main(String[] args) {
    
   
    
    
  /*  removes the key only if its associated with the given value
    V replace(K key, V newValue) Map
    If the key is present then the value is replaced by newValue. If the key is not present, does nothing.
    boolean replace(K key, V oldValue, V newValue) Map
    If the key is present and is mapped to the oldValue, then it is remapped to the newValue.
    void replaceAll (BiFunction<? super K, ? super V, ? extends V> function) Map
    replaces all values by the values computed from this function.*/
	
	 /*
     * Problem Statement :If the key is present then the value is replaced by newValue. If the key is not present, does nothing.
     */  
	 Map<String, Integer> map = new HashMap<>();
     map.put("Martin Fowler", 27);
     System.out.println(map);
     
     map.replace("Martin Fowler", 28); //see doc for java7 approach
     System.out.println(map);
     
     map.replace("laxmikant", 28);
     System.out.println(map);
     
     /*
      * Problem Statement :If the key's old value matches with specified old value then replace with new else does nothing.
      */  
     
     map.replace("Martin Fowler", 28, 29);
     System.out.println(map);
     
     map.replace("Martin Fowler", 28, 29);
     System.out.println(map);
     
     /*
      * Problem Statement : replace all the values by its double
      */  
     map.put("laxmikant", 28);
     System.out.println(map);
     map.replaceAll((k, v) -> doubleValue(k, v));
     System.out.println(map);
}
static int doubleValue(String key, int value) {
	return 2*value;
}
}
