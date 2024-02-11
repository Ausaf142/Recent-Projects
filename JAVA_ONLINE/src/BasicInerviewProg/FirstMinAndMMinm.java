package BasicInerviewProg;

public class FirstMinAndMMinm {
public static void main(String[] args) {
	int[] a= {20,10,5,1,45,1,7,8,0,0};
	int min=a[0];
	int min2=a[0];
	
	for(int i=1;i<a.length;i++) {
		if(min>a[i]) {
			min=a[i];	
		}
	}
	System.out.println("first min no "+min);
	
	for(int i=1;i<a.length;i++) {
		if( min2>min && min2>a[i] && a[i]>min) {
			min2=a[i];
		}
		
	}
	System.out.println("2nd min no "+min2);
}
}
