package String;

public class SumOf2DigitFromString {
	public static void main(String[] args) {
		String s="1ab1ss3";
		int sum=0;
		
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			int n=s.charAt(i)-48;//1  2  3 4  5  6  7  8  9
			sum=sum+n;			//49 50 51 52 53 54 55 56 57 
				
			}
		}
	
		System.out.println(sum);

}
}