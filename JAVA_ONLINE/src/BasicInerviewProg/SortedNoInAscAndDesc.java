package BasicInerviewProg;

public class SortedNoInAscAndDesc {
	public static void main(String[] args) {
		int[] a= {4,1,2,3,0};
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) { 
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
	System.out.println();//for new line
	for(int k=a.length-1;k>=0;k--) {//for descending
		System.out.println(a[k]);
}
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	
	}
	System.out.println();
	System.out.println(sum);
		
	}

}

