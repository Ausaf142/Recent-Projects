package BasicInerviewProg;

public class BasicTest {
	public static void main(String[] args) {
		int[] a= {7,5,6,9,15};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
			}
			System.out.println();
			for(int l=a.length-1;l>=0;l--) {
				System.out.println(a[l]);
			}
			int sum=0;
			for(int i=0;i<a.length;i++) {
				sum=sum+a[i];
			}
			System.out.println(sum);
			
		}
	}


