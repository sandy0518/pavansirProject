package com.crm.VTiger.TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "provideMeData")
	public void getingMultiData(String name, String regId)
	{
		System.out.println("Name is "+name+" regId is "+regId);
	}
	
	@DataProvider
	public Object[][] provideMeData()
	{
		Object [][] obj=new Object[3][2];
		
		obj[0][0]="Akash";
		obj[0][1]="101";
		
		obj[1][0]="Ameer";
		obj[1][1]="102";
		
		obj[2][0]="SwarnaLata";
		obj[2][1]="103";
		
		return obj;
	}
	
}
