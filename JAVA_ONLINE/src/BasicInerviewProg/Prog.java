package BasicInerviewProg;

public class Prog {
public static void main(String[] args) {
	int[] a= {5,1,2,4,2};
	int[] b= {2,3,1,5};
	//o/p==	  7,4,3,9,2
	int sum=0;
	for(int i=0;i<a.length;i++) {
		
			for(int j=i;j<b.length;j++) {
				sum=a[i]+b[j];
				break;
				
			}
	
			
			try {
			System.out.println(sum);
		
		}	
		
			
		 catch (Exception e) {
			if(a.length>b.length) {
				System.out.println(a[a.length]+" ");
			}
		 
			else {
				System.out.println(b[b.length]+" ");
			}
		 }
			
		}
}
}
		
		
	


