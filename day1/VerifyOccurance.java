package javaweek1.day1;

import java.util.HashMap;

public class VerifyOccurance {

	public static void main(String[] args) 
	
	{
		//Approach 1
		
		String content = "You dont have other choice than following me, OK ?";
		int count = 0;
		
		char[] array = content.toCharArray();
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]=='o') 
			{
				count++;
			}
		}
		
		System.out.println("Occurnace of o via approach 1 is : "+count);
		
		{
		//Approach 2
		String content2 = "You dont have other choice than following me, OK ?";
		int counttt=0;
		for (int i = 0; i < content2.length(); i++) 
		{
			if(content2.charAt(i)=='o')
			{
				counttt++;
			}
				
		}
		System.out.println("Occurnace of o via approach 2 is : "+counttt);
		}
		
		{
		//Approach 3
			String content3 = "You dont have other choice than following me, OK ?";
			HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
			int value = 0;
			for (char ch: content3.toCharArray()) 
			{
				if(hashMap.containsKey('o')) 
				{
					value = hashMap.get('o');
					hashMap.put(ch, value+1);
				}
				else
				{
					hashMap.put(ch, 1);
				}
			}
			System.out.println("Occurnace of o via approach 3 is : " +value);		
		}
		
	}		
}
