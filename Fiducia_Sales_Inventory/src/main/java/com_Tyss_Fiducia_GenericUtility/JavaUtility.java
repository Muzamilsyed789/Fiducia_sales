package com_Tyss_Fiducia_GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class JavaUtility {
public int getRandomNum() {
	Random r=new Random();
	int random=r.nextInt(500);
	return random;
	
}
public String getSystemData() {
	Date d=new Date();
	String date=d.toString();
	return date;
			
}
public String getSystemDateInFormate() {
	SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	Date d=new Date();
	String sysDateFormate=dateFormate.format(d);
	return sysDateFormate;
}
}
