package com.list;
import java.util.*;

public class listIterator {

	private static final String Integer = null;

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		// Backward traversal
//		ListIterator<Integer> it=list.listIterator(list.size());
//		
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//		}
		
		
	// Adding 
		ListIterator<Integer> it=list.listIterator(list.size());
//		while(it.hasNext()) {
//			it.add(5);
//			it.next();
//			
//		}
//		System.out.println(list);
		
	
// updating
	while(it.hasPrevious()) {
		int x=(Integer)it.previous();
		it.set(x*2);
		
	}
		System.out.println(list);
	}

}

// here 3 various are mixing ,, review once and made changes

