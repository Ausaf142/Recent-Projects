package com.vtiger.GenericUtility;

import java.util.Random;

public class JavaUtility {
public int randomKey() {
	Random ran=new Random();
	int key = ran.nextInt(1000);
	return key;
}
}
