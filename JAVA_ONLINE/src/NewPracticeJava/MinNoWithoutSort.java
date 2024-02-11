package NewPracticeJava;

public class MinNoWithoutSort {
public static void main(String[] args) {
	int [] s= {7,89,2,9,6,1,8};
	int min = s[0];
	for(int i=1;i<s.length;i++) {
			if(min>s[i]) {
				min=s[i];
			}
				
		
	}
	System.out.println(min);
}
}
