package MyPractice;

public class AddingTwoArrayDigits {
public static void main(String[] args) {
	
	int[] a= {7,5,2,6,3};
	int[] b= {6,9,2,1};
	
	int length=a.length;
	if(a.length<b.length) {
		length=b.length;
	
	}
	for(int i=0;i<length;i++) {
		for(int j=i;j<length;j++) {
			
		
	try {
		System.out.println(a[i]+b[j]);
	}
		catch(Exception e){

	if(a.length>b.length) {
		System.out.println(a[i]+" ");
	}
	else
	{
		System.out.println(b[i]+" ");
	}
		
	}
		
		}
	}
	}
}


