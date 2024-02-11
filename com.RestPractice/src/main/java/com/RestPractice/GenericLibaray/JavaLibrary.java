package com.RestPractice.GenericLibaray;

import java.util.Random;

public class JavaLibrary {
	
	public int random() {
		Random random=new Random();
		int key = random.nextInt(1000);
		return key;
	}

}
