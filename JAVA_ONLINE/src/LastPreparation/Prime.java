package LastPreparation;

public class Prime {
	public static void main(String[] args) {
		int n,i,flag=0;
		n=20;
		if(n==0 || n==1) {
			System.out.println(n+" is not prime no");
		}
		else if (n>1) {
			for(i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(n+" is not prime no");
				//flag=1;
			}
			}	
			 {
				System.out.println("prime");
			}
			
		}
		
		
	}

}
