package javaweek1day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation {
	public static boolean isValidEntry(String userName)
	{
		String regex = "^(?=.{8,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._$@]+(?<![_.])$";
		
		Pattern pat = Pattern.compile(regex);
		
		Matcher mat = pat.matcher(userName);
		return mat.matches();
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 String  input1 = "Balaji1";
		 System.out.println(isValidEntry(input1));
		 
		 String input2 = "Testleaf$123";
		 System.out.println(isValidEntry(input2));
		 
		 String input3 = "Shobana@114";
		 System.out.println(isValidEntry(input3));
		 
		 String input4 = "Shobana()114";
		 System.out.println(isValidEntry(input4));
		 

	}

	

}
