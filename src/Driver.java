
public class Driver 
{
	public static void main(String[] args)
	{
		String s = "Matthew";
		String vowels = "aeiouAEIOU";
		int count = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(vowels.indexOf(s.charAt(i)) != -1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
