package IntentSystem;

public class PrimeNumver {
public static void main (String[] args) {
	int  n , i , flag =0 ;
	n = 11;
	if (n==0 || n ==1){
		System.out.println("not a prime"+n);
	}
	else {
		for(i=2; i<=n/2; i++) {
			if(n%i==0){
				System.out.println("not prime"+n);
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("prime"+n);
		}
	}
}
}
