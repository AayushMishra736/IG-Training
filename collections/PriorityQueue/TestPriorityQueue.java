package com.collections.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
	PriorityQueue<String> queue = new PriorityQueue<String>();  
	queue.add("Amit");  
	queue.add("Vijay");  
	queue.add("Karan");  
	queue.add("Jai");  
	queue.add("Rahul");
	System.out.println("head:"+queue.element());  
	System.out.println("head:"+queue.peek());  
	System.out.println("Iterating the queue elements:");  
	Iterator<String> itr = queue.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	queue.remove();
	queue.poll();
	System.out.println("Iterating the queue elements:");  
	Iterator<String> itr2 = queue.iterator();
	while(itr2.hasNext()) {
	System.out.println(itr2.next());	
	}
	
	}

}
