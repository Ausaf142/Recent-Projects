package MyPractice;

public class Swaping {
public static void main(String[] args) {
//	int a=12;
//	int b=20;
//	int temp=0;
//	temp=a;
//	a=b;
//	b=temp;
//	System.out.println("a= "+a);
//	System.out.println("b= "+b);
	
	//sorting the no.s in Array
	int[] a= {7,9,2,6,3,4};
	int temp=a[0];
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int k=0;k<a.length;k++) {
	System.out.println(a[k]);
	}
	}
	
	
	
}


