package com.Revison;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class Collection {
	public static void main(String[] args) {
		

//	Stack<Object> s = new Stack<Object>();
//	s.push(10);
//	s.push(20);
//	s.push('A');
//	System.out.println(s.pop());
//	System.out.println(s.pop());
//	System.out.println(s.pop());
	
		
//		LinkedList<Object> list=new LinkedList<Object>();
//		list.add("hi");
//		list.add("helo");
//		list.add("bye");
//		list.add('A');
//		
//			list.add(10);
//			list.add(10);
//			list.add(null);
//			list.add("AUSAF");
//			list.add("testYantra");
//			System.out.println(list.getFirst());
//			System.out.println(list.getLast());
//			System.out.println(list);
//		PriorityQueue<Object> queue=new 	PriorityQueue<Object>();
//		queue.add('a');
//		queue.add('b');
//		queue.add('c');
//		queue.add('d');
//		
//		System.out.println(queue.poll());
//		System.out.println(queue);
//		System.out.println(queue.peek());
//		System.out.println(queue);
//		
//		HashSet<Object>set=new HashSet<Object>();
//		set.add(10);
//		set.add(10);
//		set.add(null);
//		set.add(null);
//		set.add("bye");
//		Iterator<Object> it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

//		
//		LinkedHashSet<Object>set=new LinkedHashSet<Object>();
//		set.add(10);
//		set.add(10);
//		set.add(null);
//		set.add(null);
//		set.add("bye");
//		Iterator<Object> it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		SortedSet<Object> set=new TreeSet();
//		set.add("dsad");
//		set.add("sadfewf");
//		set.add("ljh");
//		System.out.println(set);
		
//		TreeSet<Integer> tree =new TreeSet<Integer>();
//		tree.add(12);
//		tree.add(64);
//		tree.add(87);
//		tree.add(90);
//		System.out.println(tree);
		
//		Hashtable<Integer,String> map=new Hashtable<Integer,String>();
//		map.put(104, "10");
//		map.put(102, "hello");
//		map.put(101, "bye");
//		map.put(101, "bye");//not allowed
//		map.put(100, null);			 //exception dega 
//		map.put(null, "take care" ); //exception derha isliye
//		System.out.println(map);
		
//		HashMap<Integer,String> map=new HashMap<Integer,String>();
//		map.put(104, "10");
//		map.put(102, "hello");
//		map.put(101, "bye");
//		map.put(101, "bye");
//		map.put(100, null);	
//		map.put(106, null);
//		map.put(109, null);
//		map.put(null, "take care" );
//		System.out.println(map);
//		for(Entry<Integer, String> m:map.entrySet()) {
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(104, "10");
		map.put(102, "hello");
		map.put(101, "bye");
		map.put(101, "bye");
		map.put(100, null);	
		map.put(106, null);
		map.put(109, null);
		map.put(null, "take care" );
		System.out.println(map);
		for(Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
}
}