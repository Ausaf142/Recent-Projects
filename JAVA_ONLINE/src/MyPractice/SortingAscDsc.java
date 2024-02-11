package MyPractice;

public class SortingAscDsc {
	public static void main(String[] args) {
		int[] a= {8,3,9,1,7,5};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Asceneding order");
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		
		}
		System.out.println();
		System.out.println("Descending order ");
		for(int k=a.length-1;k>=0;k--) {
			System.out.print(a[k]+" ");
			
		}
		System.out.println();
		System.out.println("sum of all");
		int sum=0;
		for(int m=a.length-1;m>=0;m--) {
			sum=sum+a[m];
			
		}
		System.out.println(sum);
		
	}

}
