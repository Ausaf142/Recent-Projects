package BasicInerviewProg;

public class AddFirstThreeNo {
public static void main(String[] args) {
	int[] s= {9,8,2,7,5};
	int temp;
	for(int i=0;i<s.length;i++) {
		for(int j=i+1;j<s.length;j++) {
			if(s[i]>s[j]) {
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
				
			}
		}
	}
	int sum=0;
	for(int k=0;k<=2;k++) {
		sum=sum+s[k];
		System.out.println(s[k]);
		
	}
	System.out.println(sum);
}
}
