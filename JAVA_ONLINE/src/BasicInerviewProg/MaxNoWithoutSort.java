package BasicInerviewProg;

public class MaxNoWithoutSort {
public static void main(String[] args) {
	int[] a= {20,10,5,0};
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
	}
	System.out.println("maximum no is "+max);
}
}
