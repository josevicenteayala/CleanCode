package com.intergrupo.cleancode.comments;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LegalComments {

	public boolean validateDate(String dateToCompare) {
		// format matched ddd-dd-dddd, means 3 digits followed by middle strip, and 2 digits followed by middle stripe and 4 digits
		Pattern timeMatcher = Pattern.compile("^(\\d{3}-?\\d{2}-?\\d{4})$");
		Matcher matcher = timeMatcher.matcher(dateToCompare);
		return matcher.matches();
	}

	public boolean specificRuleInTheCode() {
		Calendar calendar = Calendar.getInstance();
		if( calendar.get(Calendar.MONTH) == Calendar.NOVEMBER) {
			System.out.println("This is the montho of the Family");
			return true;
		}
		return false;
	}
	

}
