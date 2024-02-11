package MyPractice;

public class MaxNo {
	public static void main(String[] args) {
		
		int[] a= {7,8,2,5,6,};
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
				
			}
		}
		System.out.println("max "+max);
		
		

	}

}
