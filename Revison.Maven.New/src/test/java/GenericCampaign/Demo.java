package GenericCampaign;

public class Demo {
	public static void main(String[] args) {
		int[] s= {1,2,3,5,7,9,10,6,11};	
		int sum=0;
		for(int i=0;i<=s.length;i++) {
			for(int j=i+1;j<=s.length;j++) {
			if(s[i]%s[j]==0) {
				 sum = sum+s[j];	
				
			}
			
			System.out.println(sum);
			
			}	
		}
		
	}

}
