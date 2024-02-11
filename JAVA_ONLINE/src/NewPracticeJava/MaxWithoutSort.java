package NewPracticeJava;

public class MaxWithoutSort {
public static void main(String[] args) {
	int[] s= {7,2,6,89,99,};
	int max=s[0];
	for(int i=1;i<s.length;i++) {
		if(max<s[i]) {
			max=s[i];
			
		}
	}
	System.out.println("max no is "+max);
}
}
