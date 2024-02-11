package BasicInerviewProg;

public class FirstMaxUsingBubbleSort {
	public static void main(String[] args) {
		int[] a= {4,1,2,3,0};
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) { //1,4	1,4
				if(a[i]>a[j]) {				//1,2,4		1,2,3
					int temp=a[i];			//1,2,3,4	1,2,3,4
					a[i]=a[j];				//1,2,3,0,4//1,2,0,3,4//1,2,0,3,4 //1,0,2,3,4//0,1,2,3,4
					a[j]=temp;
				}
			}
		}
	for(int k=0;k<a.length;k++) {
		System.out.println(a[k]);
	}
	System.out.println();
	System.out.println(a[a.length-1]);//maxim no
	
		
	}
}

