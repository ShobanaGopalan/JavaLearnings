package javaweek1day2;

public class NumAlpSpaceVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "1. It is Work from Home  not Work for Home";
		//char[] array = input.toCharArray();
		
		//Numbers
		String num = input.replaceAll("[^0-9]", "");
		int number = num.length();
		System.out.println("The count of numbers in string is:" + number );
		
		//Upper case
		String upr = input.replaceAll("[A-Z]", "");
		int upper = upr.length();
		System.out.println("The count of Uppercase letters in string is:" +(input.length()- upper) );
		
		//lower case
		String lwr = input.replaceAll("[a-z]", "");
		int lower = lwr.length();
		System.out.println("The count of Lowercase letters in string is:" +(input.length()- lower));
		
		//space
		String spc = input.replaceAll(" ", "");
		int space = spc.length();
		System.out.println("The count of space  in string is:" + (input.length()-space) );


			}

}
