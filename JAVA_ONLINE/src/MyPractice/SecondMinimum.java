package MyPractice;

public class SecondMinimum {
	public static void main(String[] args) {
		int[] a= {7,8,2,5,6,5,9,45,1,7,8,0,0};
		int min = a[0];
		int min2=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
				
			}
		}
		System.out.println("first min"+min);
		for(int j=1;j<a.length;j++) {
			if(min2>a[j]  && a[j]>min) {
				min2=a[j];
				
			}
		}
		System.out.println("Second min "+min2);
		
		

	}

	}


