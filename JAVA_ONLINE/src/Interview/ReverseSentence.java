package Interview;

public class ReverseSentence {
	public static void main(String[] args) {
		String s="i love my india";
		String[] rev = s.split(" ");
		for(int i=rev.length-1;i>=0;i--) {
			System.out.print(rev[i]+" ");
		}
	}

}
