package com.learning.FactoryPattern;

import java.util.Calendar;

public class FactoryExample {

	public static void main (String [] args){
		
		Calendar cal = Calendar.getInstance();
				
		System.out.println(cal);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
}
