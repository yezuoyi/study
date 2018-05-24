package com.yzy.study.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	 public static void main(String[]args)
	    {
		 
		    ArrayList<String> list = new ArrayList<>();
		    
		    list.add("India");
		    list.add("Australia");
		    list.add("Australia");
		    list.add("South Africa");
		    list.add("India");// adding duplicate elements
		    
	        HashSet<String> h = new HashSet<String>();
	 
	        // adding into HashSet
	     /*   h.add("India");
	        h.add("Australia");
	        h.add("Australia");
	        h.add("South Africa");
	        h.add("India");// adding duplicate elements
*/	        
	        h.addAll(list);
	        
	        for(String s : h) {
	        	System.out.println(s);
	        }
	 
	        // printing HashSet
	        System.out.println(h);
	        System.out.println("List contains India or not:" +
	                           h.contains("India"));
	 
	        // Removing an item
	        h.remove("Australia");
	        System.out.println("List after removing Australia:"+h);
	 
	        // Iterating over hash set items
	        System.out.println("Iterating over list:");
	        Iterator<String> i = h.iterator();
	        while (i.hasNext())
	            System.out.println(i.next());
	    }
}
