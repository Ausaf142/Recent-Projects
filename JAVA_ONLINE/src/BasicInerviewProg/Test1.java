package BasicInerviewProg;

public class Test1 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,2};
		int[] b= {8,5,3,1};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<b.length;j++) {
				 sum=a[i]+b[j];
				 break;
			}
		try {
			System.out.println(sum);
		}
		catch(Exception e){
			if(a.length>b.length) {
				System.out.println(a[a.length]+" ");
			}
			else
			{
				System.out.println(b[b.length]+" ");
			}
			
		}
			
		}
	

}
}