package NewPracticeJava;

public class CountTheVowel {
	public static void main(String[] args) {
		String s="india";
		int count=0;
//without parsing into character Array		
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
//				count++;
//			}
//		}
//		System.out.println("vowels are "+count);
		
//Other method by converting or parsing into character array
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				count++;
			}
		}
		System.out.println("vowels are "+count);
		
	}

}
