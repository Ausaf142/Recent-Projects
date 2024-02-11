package BasicInerviewProg;

public class MinNoWithoutSort {
public static void main(String[] args) {
	int[] a= {20,10,5,0};
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(min>a[i]) {
			min=a[i];
			
		}
	}
	System.out.println("minimum no is "+min);
}
}
