package Interview;

public class bubbleSortDescending {
	public static void main(String[] args) {
		int[] a= {44,55,66,22,11};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j] ){
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}
			
			}
			System.out.print(a[i]+" ");
		}
	}

}
