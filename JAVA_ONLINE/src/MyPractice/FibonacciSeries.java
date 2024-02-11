package MyPractice;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1;						//0+1=1;
		int c;							//1+1=2;
		for(int i=0;i<=10;i++) {		//1+2=3
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
