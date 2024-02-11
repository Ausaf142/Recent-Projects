package MyPractice;


import java.util.LinkedHashSet;

public class CountTheEachAlphabtes

{
public static void main(String[] args) {
	String s="ausaf";
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	
	for(int i=0;i<s.length();i++) {
		set.add(s.charAt(i));
	}
	
	for( Character chr:set) {
		int count=0;
		for(int i=0;i<s.length();i++) {
		if(chr==s.charAt(i)) {
			count++;
		}
		
	}
		System.out.println(chr+"="+count);
	}
	
	

}
}


