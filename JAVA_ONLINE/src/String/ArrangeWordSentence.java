package String;

public class ArrangeWordSentence {
public static void main(String[] args) {
	String str="welcome to bihar city";//city bihar to welcome
	String[] s = str.split(" ");
	for(int i=s.length-1;i>=0;i--) {
		System.out.print(s[i]+" ");
	}

}
}
