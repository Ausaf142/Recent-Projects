package MyPractice;

public class MinWithBubble {
	public static void main(String[] args) {
		int[] s= {7,8,5,3,1};
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]<s[j]) {
					int temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
		System.out.println();
		System.out.println("min no is "+s[s.length-1]);
		System.out.println("max no is "+s[0]);
		
	}

}
