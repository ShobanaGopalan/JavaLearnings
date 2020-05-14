package javaweek1day2;

public class ReverseWordsInOrdNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content = "When the world realise its own mistake, corona will dissolve automatically";
		String[] splitContent = content.split(" ");
		for (int i = 0; i < splitContent.length; i++) 
		{
			if(i%2 != 0)
			{
				StringBuffer buffer = new StringBuffer(splitContent[i]);
				splitContent[i] = buffer.reverse().toString();
			}
		}
		for (int i = 0; i < splitContent.length; i++) 
		{
			System.out.print(splitContent[i]+" ");
		}
	}

}
