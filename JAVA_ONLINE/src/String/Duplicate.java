package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Duplicate {
	public static void main(String[] args) {
	String s="tester";
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++) {
		
		System.out.println(s.charAt(i));
		set.add(s.charAt(i));
		
	}
	System.out.println(set);
	
	

}
}