package com.Revison;

import java.util.LinkedHashSet;

public class Assignment {
	public static void main(String[] args) {
		int[] a= {4,1,1,3,5,6,7,6};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
		set.add(a[i]);
	}
		System.out.println(set);
		int count=0;
		for(Integer in:set) {
			for(int j=0;j<a.length;j++) {
				if(in.equals(a[j])) {
					count++;
				}
			}
			if(count>=1) {
				System.out.println(in+" "+count);
			}
			
		}

}
}