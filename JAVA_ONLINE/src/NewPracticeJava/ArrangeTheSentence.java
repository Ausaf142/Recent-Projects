package NewPracticeJava;

public class ArrangeTheSentence {
public static void main(String[] args) {
	String s="i am a boy";//boy a am i
	String[] sen = s.split(" ");
	for(int i=sen.length-1;i>=0;i--) {
		System.out.print(sen[i]+" ");
	}
	
}
}
