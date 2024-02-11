package LastPreparation;

import java.util.Scanner;

public class Polidrom {
	 public static void main(String args[]){  
	int sum=0 ,temp , r ;
    Scanner sc = new Scanner(System.in);
	         int n= sc.nextInt();
	         temp =n ;
	         while(n>0) {
	        	 r =n%10;
	        	 sum = (sum*10)+r;
	        	 n=n/10; 
	         }
	         if(temp==sum) {
	        	 System.out.println("Pallendrom");
	         }else {
	        	 System.out.println("not pallendrom");
	        	 }
	         
		}  
		}  

