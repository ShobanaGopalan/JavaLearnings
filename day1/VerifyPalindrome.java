package javaweek1.day1;

public class VerifyPalindrome {

	public static void main(String[] args) 
	{
		// Approach 1
		
		String content = "malayalam";
		String reverse = "";
		for (int i = 0; i < content.length(); i++) {
			reverse += content.charAt(i);
		}
		System.out.println(content.equals(reverse)? "Yes, Given word is a palindrome":"No, Given word is not palindrome");

		
		{
		// Approach 2
			
		String content2 = "madamm";
		StringBuffer buff = new StringBuffer(content2);
		String reversee = buff.reverse().toString();
		if(reversee.equals(content2))
		{
			System.out.println("Yes, Given word is a palindrome");
		}
		else
		{
			System.out.println("No, Given word is not a palindrome");
		}
		}
	}

}
