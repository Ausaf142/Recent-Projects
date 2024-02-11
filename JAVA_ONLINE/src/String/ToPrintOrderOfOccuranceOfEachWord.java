package String;

public class ToPrintOrderOfOccuranceOfEachWord {
public static void main(String[] args) {
	String s="ab12z@x3&";
	//abzx 123 @&
	String alpha=" ";
	String num=" ";
	String spc=" ";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='A' && s.charAt(i)<='Z'){
			alpha=alpha+s.charAt(i);
		}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else {
				spc=spc+s.charAt(i);
			}
		}
	System.out.println(alpha+num+spc);
	}
}

