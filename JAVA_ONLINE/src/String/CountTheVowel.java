package String;

public class CountTheVowel {
	public static void main(String[] args) {
		String s1="india";
		int count =0;
		char[] s = s1.toCharArray();
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u') {
				count++;
			}
			
		}
		System.out.println("vowels are"+count);
		
	
}
}
