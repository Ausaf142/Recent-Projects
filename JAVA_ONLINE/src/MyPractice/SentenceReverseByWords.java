package MyPractice;

public class SentenceReverseByWords {
	public static void main(String[] args) {
		String s="India Is My Country";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
		
//	String s="India Is My Country";
//		String[] str=s.split(" ");
//		String temp=str[0];
//		str[0]=str[str.length-1];
//		str[str.length-1]=temp;
//		for(int i=0;i<str.length;i++) {
//			System.out.print(str[i]+" ");
//			
//		}
	}

}
