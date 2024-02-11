package com.Revison;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array2 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(70);
		list.add(100);
		list.add(80);
		System.out.println(list);//as what i have written
		Collections.sort(list);
		System.out.println(list);//sorted
		for(Integer i:list) {
			System.out.println(i);
		}
	}

}
