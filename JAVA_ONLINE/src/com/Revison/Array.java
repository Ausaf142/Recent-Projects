package com.Revison;

import java.util.ArrayList;

public class Array {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add("a");
		list.add(null);
		list.add(10);
		list.add("hi");
		list.add('$');
		list.add(2, "helo");
		System.out.println(list);
		ArrayList list2=new ArrayList();
		list2.add("bye");
		list2.add("a");
		list.add("hi");
		
		//list2.addAll(list);
	/*	System.out.println(list2);
		if(list.contains('A')) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}*/
		list.retainAll(list2);//show the duplicates
		System.out.println(list);
		//list.removeAll(list2);
		System.out.println(list);//remove the duplicates
	}

}
