package BasicInerviewProg;

public class SwapNoUsing3Var {
public static void main(String[] args) {
	int a=10;//should be 20
	int b=20;//should be 10
	a=a+b;//10+20=30 a=30
	b=a-b;//30-20=10 b=10
	a=a-b;//30-10=20 a=20
	System.out.println(a);
	System.out.println(b);
}
}
