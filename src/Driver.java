import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter something: ");
		String val = input.nextLine();
		int count = 0;
		String vowels = "aeiouAEIOU";
		for(int i = 0; i < val.length(); i++)
		{
			if(vowels.indexOf(val.charAt(i)) != -1)
			{
				count++;
			}
		}
		System.out.println(count);
		input.close();
	}
		
}
