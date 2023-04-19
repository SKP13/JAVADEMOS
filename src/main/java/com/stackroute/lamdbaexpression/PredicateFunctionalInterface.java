package com.stackroute.lamdbaexpression;

import java.util.ArrayList;
import java.util.List;

public class PredicateFunctionalInterface {
    //write logic to find the values that starts with letter I in the given list
    public List<String> findPattern(List<String> list) {
    	  List<String> startsWithI= new ArrayList<>(); 
    	     list.forEach((li)->
    	     {
    	      if(li.startsWith("I")){
    	       if(!startsWithI.contains(li)) {
    	    	   startsWithI.add(li);

    	       }
    	      }
    	     });
    	        return startsWithI;
    	    }
    	}
