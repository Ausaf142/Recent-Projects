package IntentSystem;

public class StringReverse {

	public static void main(String[] args) {
		String name = "ausaf";
		String rev =" ";
		for(int i=name.length()-1;i>=0;i--) {
			char reverse = name.charAt(i);
			 rev = rev + reverse;
			 
		}
		System.out.print(rev);
	}

}
