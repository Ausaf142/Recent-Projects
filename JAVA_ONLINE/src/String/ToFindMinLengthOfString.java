package String;

public class ToFindMinLengthOfString {
	public static void main(String[] args) {
		String[] s= {"ab","abc","abcd","abcde","abcdef","abcd"};//maxm length
		String minLength=s[0];
		System.out.println(minLength.length());
		for(int i=1;i<s.length;i++) {
			System.out.println(s[i].length());
			if(minLength.length()>s[i].length()) {
				minLength=s[i];
			}
		}
		for(int i=0;i<s.length;i++) {
			if(minLength.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}

}
}
