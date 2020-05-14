package javaweek1day2;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "asdf1qwer9as8d7";
		
		int sum = 0;
		int num = 0;
		for (int i = 0; i < input.length(); i++) {
			char charss = input.charAt(i);
			if(Character.isDigit(charss))
			{
				num = Integer.parseInt(String.valueOf(charss));
				System.out.println(num);
				sum = sum + num;
			}
		}
		
		if(sum==0)
		{
			System.out.println("No numbers present in the given string");
		}
		else
		{
			System.out.println("Sum of Integers" +sum);
		}
	}

}
