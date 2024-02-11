package Array;

public class Array3 {
	 static boolean flag=false;
	public static boolean contains(int[] arr,int num) {
		for(int c:arr) {
			if(num==c) {
				flag=true;
//				break;
						}
					}
			return flag;
		}
	
public static void main(String[] args) {
	int[] numbers = {784,585,666,989,124,325};
	int num=585;
	contains(numbers,num);
	if(flag==true) {
		System.out.println("Matched "+num);
	}
	else {
		System.out.println("Mismatched "+num);
	}

	
}
}
