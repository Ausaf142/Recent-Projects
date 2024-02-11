package NewPracticeJava;

import java.util.LinkedHashSet;

public class ByRemovingDuplicateVowelThenCount {
public static void main(String[] args) {
	String s="elephanteye";
	char[] character = s.toCharArray();
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<character.length;i++) {
		set.add(character[i]);
	}
	int count=0;
	for( Character ch:set) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			count++;
		}
	}
	System.out.println("vowels are "+count);
		
	}
}

