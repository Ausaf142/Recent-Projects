package String;

public class ToFindMaxLengthOfStringArray {
	public static void main(String[] args) {
		String[] s= {"ab","abc","abcd","abcde","abcdef","abcd"};//maxm length
		String maxLength=s[0];
		System.out.println(maxLength.length());
		for(int i=1;i<s.length;i++) {
			System.out.println(s[i].length());
			if(maxLength.length()<s[i].length()) {
				maxLength=s[i];
			}
		}
		for(int i=0;i<s.length;i++) {
			if(maxLength.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}

}
}