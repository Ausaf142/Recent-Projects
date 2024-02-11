package MyPractice;

import java.util.LinkedHashSet;

public class CountTheDuplicatess {
	public static void main(String[] args) {
		String str="I I will rock rock rock One day day ";
		String[] s = str.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);
		}
		
		for( String alp:set) {
			int count=0;
			for(int j=0;j<s.length;j++) {
				if(alp.equals(s[j])){
					count++;
				}
			}
			if(count>1) {
			System.out.println(alp+"="+count);
		}
	}

}
}