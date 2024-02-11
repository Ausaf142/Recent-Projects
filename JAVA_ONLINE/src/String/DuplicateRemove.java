package String;

import java.util.LinkedHashSet;

public class DuplicateRemove {
public static void main(String[] args) {
	String s="TEster";
	String str = s.toLowerCase();//we have change uppercase into lower
	//used linkedhashSet bcs it remove duplicate and also maintain insertion
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++) {
		System.out.println(str.charAt(i));
		set.add(str.charAt(i));
	}
	System.out.println(set);
	
}
}
