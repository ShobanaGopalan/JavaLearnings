package javaweek1day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	public static boolean isValidEmail(String emailID)
	{
		String regex = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9.-]+.[a-z.]{4,}";;
		
		Pattern pat = Pattern.compile(regex);
		
		Matcher mat = pat.matcher(emailID);
		return mat.matches();
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 String  input1 = "balaji.c@tunatap.co.uk";
		 System.out.println(isValidEmail(input1));
		 
		 String input2 = "naveen e@tl.com";
		 System.out.println(isValidEmail(input2));
		 
		 String input3 = "saisri1511@yahoo.com";
		 System.out.println(isValidEmail(input3));
		 
		 String input4 = "shobana@gmail.com#$";
		 System.out.println(isValidEmail(input4));
		 

	}
	
	
}
