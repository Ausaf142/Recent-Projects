package BasicInerviewProg;

public class FirstMiNoBubbleSort {
	public static void main(String[] args) {
		int[] a= {4,1,2,3,0};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {//used (>)for ascending or use (<) for descending
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		System.out.println(a[0]);//minimum no
		System.out.println(a[a.length-1]);//max number
		}
		
		
		
	
	}


