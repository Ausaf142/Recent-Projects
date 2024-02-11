package BasicInerviewProg;

public class AdditionFromLast {
	public static void main(String[] args) {
		int[] a= {4,1,2,3,0};
		for (int i=0;i<a.length;i++) {
			for(int j=i+i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	for(int k=0;k<a.length;k++) {//for asceneding
		System.out.println(a[k]);
}
	int sum=0;
	for(int i=a.length-1;i>a.length-4;i--) {//from tha last adding three element
		sum=sum+a[i];
	
	}
	System.out.println();
	System.out.println(sum);
}
}