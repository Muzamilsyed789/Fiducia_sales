package com_Tyss_Fiducia_GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryImplementationClass implements IRetryAnalyzer {
int lowercount=0;
int uppercount=1;
@Override
public boolean retry(ITestResult result) {
	if(lowercount<uppercount) {
		lowercount++;
		return true;
	}
	return false;
}
}
