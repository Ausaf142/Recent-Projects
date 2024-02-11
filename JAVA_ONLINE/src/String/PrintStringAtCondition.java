package String;

public class PrintStringAtCondition {
	public static void main(String[] args) {
		//24 % 5==>"hi"
		//24 % 3==>"bye"
		//24 % 5&3==>"hi bye"
		
		int num=15;
		if(num%5==0 && num%3==0) {
			System.out.println("hi bye");
		}
		else if(num%5==0) {
			System.out.println("hi");
		}
		else if(num%3==0)
		{
			System.out.println("bye");
		}
		else
		{
			System.out.println("good bye");
		}
	}

}
