package LastPreparation;

import String.DuplicateRemove;

public class Duplicates {
    public static void main(String[] args) {
    String sen=" ";
    	String s="aabbcc";
    	for(int i=0;i<s.length();i++) {  
    		
    			if(s.charAt(i)==s.charAt(i)) {   
    				sen=s.charAt(i)+ sen;
                    
    			}
    		}
    	
    	System.out.println(sen);
    }
	}