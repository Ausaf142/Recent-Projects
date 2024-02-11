package MyPractice;

public class AdditionFromFirstThree {
public static void main(String[] args) {
	int[] s= {4,9,5,3,1,5};
	//for sorting in acsending
	for(int j=0;j<s.length;j++) {
		for(int k=j+1;k<s.length;k++) {
			if(s[j]>s[k]) {
				int temp=s[j];
				s[j]=s[k];
				s[k]=temp;
			}
		}
		
	}
	for(int o=0;o<s.length;o++) {
		System.out.println(s[o]);
		
	}
	int sum=0;
	for(int i=0;i<3;i++) {
		sum=sum+s[i];
	}
	System.out.println("Addition of first three digit is "+sum);
	System.out.println();
	int sum1=0;
	for(int z=s.length-1;z>=s.length-3;z--) {
		sum1=sum1+s[z];
	}
	System.out.println("Additinn of the last three digit "+sum1);
}
}
