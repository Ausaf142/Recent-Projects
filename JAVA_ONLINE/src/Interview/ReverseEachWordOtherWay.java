package Interview;

public class ReverseEachWordOtherWay {
	public static void main(String[] args) {
		String s="my name is amar";
		String[] rev = s.split(" ");
		String temp=rev[0];
		rev[0]=rev[rev.length-1];
		rev[rev.length-1]=temp;
		for(int i=0;i<rev.length;i++) {
			System.out.print(rev[i]+" ");
		}
		
		
	}

}
 