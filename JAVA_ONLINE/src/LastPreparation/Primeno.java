package LastPreparation;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give ur number");
		int n=sc.nextInt();
	int flag=0;
	if(n==0 || n==1) {
		System.out.println(n+" is not prime");
	}
	else {
				for(int i=2;i<=n/2;i++) { 
			if(n%i==0) { //boolean   
				System.out.println(n+" is not a prime no");
				flag=1;
				break;
			}
		}
		if (flag==0) {
			System.out.println(n+" is prime");
		}
		
	}
	
	
		}   
}