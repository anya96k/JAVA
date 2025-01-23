package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program {

	public static void main(String[] args) {
		List<String>list = new ArrayList<String>( );
		list.add("India"); 
		list.add("USA");
		list.add("China");
		list.add("India");
		list.add("Russia");
		list.add("England"); 
		
		System.out.println("Size : "+list.size());
		System.out.println("List : "+list.toString());
		
		list.add(3, "Nepal");
		System.out.println("List : "+list.toString());
		int index = 5; 
		String e5 = list.get(index); 
		System.out.println("Ele : "+e5);
		e5 = e5.toUpperCase(); 
		System.out.println("Ele : "+e5);
		list.set(index, e5); 
		System.out.println("List : "+list.toString());
		list.remove(index); 
		System.out.println("List : "+list.toString());
		
		 
		String find = "USA";
		boolean found = list.contains(find); 
		if(found)
			System.out.println("String :  " + find + " found ");
		else 
			System.out.println("String not found");
		//indexOf() , lastIndexOf()
		
		int idx = list.indexOf(find); 
		if(idx!=-1)
		  System.out.println("Ele : " + find + " is found at location " + idx);
		else 
		  System.out.println("Element not found");
		
		
		

		System.out.println("Traversing using iterator REV traverse :: ");
		ListIterator<String> trav = list.listIterator(list.size()); 
		while(trav.hasPrevious())
		{
			String ele = trav.previous(); 
			System.out.println(ele);
		}
		list.clear(); 
		System.out.println();
		
		System.out.println("Size : " + list.size());
		
		Collections.addAll(list, "Rohan","Kunal","Prashant","Sagar","Amit"); 
		System.out.println("List : "+list.toString());
		
		Collections.sort(list);
		
		System.out.println("List : "+list.toString());
		
		Collections.shuffle(list);
		System.out.println("List : "+list.toString());
		
		class StringDescComparator implements Comparator<String>
		{

			@Override
			public int compare(String x, String y) {
				int diff = -x.compareTo(y); 
 				return diff; 
			}
			
		}
		System.out.println();
		list.sort(new StringDescComparator());
		System.out.println("List : "+list.toString());
	}

}
