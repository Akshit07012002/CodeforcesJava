package codeforcesJava.CodeforcesJava;
import java.io.*;

public class Word
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s = in.readLine();
		
		int upperCount = 0; int lowerCount = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if( Character.isUpperCase(s.charAt(i)) )
				upperCount++;
			else
				lowerCount++;
		}
		
		if(upperCount>lowerCount)
			System.out.println(s.toUpperCase());
		else
			System.out.println(s.toLowerCase());
	}

}
