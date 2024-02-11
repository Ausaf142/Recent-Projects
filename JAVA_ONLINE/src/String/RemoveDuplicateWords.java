package String;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String str="welcome to to bihar city";//welcome to bihar city
		String[] s = str.split(" ");
	    LinkedHashSet<String> set=new LinkedHashSet<String>();
	   for(int i=0;i<s.length;i++) {
	    set.add(s[i]);
}
	   System.out.print(set);
}
}