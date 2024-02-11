package Interview;

public class MirrorImage {
public static void main(String[] args) {
	String s="i love my india"; 		//output: aidni ym evol i

	for(int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
	}
}
} 