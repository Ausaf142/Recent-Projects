package Array;

public class Array2 {
public static void main(String[] args) {
	int sum=0;
	
	int[] arr = {5,8,9,7,1,6};
	for(int c:arr) {
		 sum=sum +c;
	}
	
	int avg=sum/arr.length;
	System.out.println(avg);
	
}
}
