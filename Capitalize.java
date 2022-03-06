package codeforcesJava.CodeforcesJava;

import java.io.*;

public class Capitalize 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String word = in.readLine();
		
		int l = word.length();
		
		if(l>0 && l<=1000)
			System.out.print(Character.toUpperCase(word.charAt(0)) + word.substring(1));		
		
	}
}
