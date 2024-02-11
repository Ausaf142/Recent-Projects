package Interview;

public class BubbleSortAscending {
	public static void main(String[] args) {
		int[] s= {9,5,7,3,4};
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
			if(s[i]>s[j]) {
						int temp=s[i];
						s[i]=s[j];
						s[j]=temp;
			}
			}
	//System.out.println(s[i]);	//my sense
		}
		for(int k=0;k<s.length;k++) {
			System.out.println(s[k]);
			}
	}

}
