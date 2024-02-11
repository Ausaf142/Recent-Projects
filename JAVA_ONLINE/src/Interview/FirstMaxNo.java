package Interview;

public class FirstMaxNo {
	public static void main(String[] args) {
		int[] s= {5,2,9,7,1,6};
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]>s[j]) {
					int temp=s[j];
					s[j]=s[i];
					s[j]=temp;
				}
			}
		}
		for(int k=0;k<s.length;k++) {
			System.out.println(s[k]);
		}
		
	
	}

}
