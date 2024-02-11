package MyPractice;

public class MinNoWithoutSorting {
	public static void main(String[] args) {
	
	int[] a= {7,8,2,5,6,};
	int min = a[0];
	for(int i=0;i<a.length;i++) {
		if(min>a[i]) {
			min=a[i];
			
		}
	}
	System.out.println("min "+min);
	
	

}
}