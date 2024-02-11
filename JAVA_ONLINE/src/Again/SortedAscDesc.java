package Again;

public class SortedAscDesc {
	public static void main(String[] args) {
		int[] a= {4,9,2,7,3,6};
		for(int i=0;i<a.length;i++) {
			for(int k=i+1;k<a.length;k++) {
				if(a[i]>a[k])	{
					int temp=a[i];
					a[i]=a[k];
					a[k]=temp;
				}
			}
			
		}
for(int j=0;j<a.length;j++) {
	
	
	System.out.print(a[j]+" ");
}
		
		
		
		
		
	}

}
