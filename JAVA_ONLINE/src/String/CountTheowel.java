package String;

public class CountTheowel {
	public static void main(String[] args) {
		String s="indiaa";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
			else if(s.charAt(i)=='e') {
				count++;
			}
			else if(s.charAt(i)=='i') {
				count++;
			}
			else if(s.charAt(i)=='o') {
				count++;
			}
			else if(s.charAt(i)=='u') {
				count++;
			}
			
		}
		System.out.println("vowels are "+count);
		
		
}
}