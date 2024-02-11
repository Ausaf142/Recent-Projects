package NewPracticeJava;

public class BubbleSortMaxMin {
	public static void main(String[] args) {
		int[] s= {7,2,6,89,99,};
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]>s[j]) {
					int temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
	
	
		System.out.println("min no is "+s[0]);
		System.out.println("max no is "+s[s.length-1]);
	

}
}