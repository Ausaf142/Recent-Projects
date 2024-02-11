package com.crm.Generic_Utility;

import java.util.Random;

public class Java_Utility {
	public int getRandom() {
		Random ran=new Random();
		int RanNum = ran.nextInt(1000);
		return RanNum;
	}
}
