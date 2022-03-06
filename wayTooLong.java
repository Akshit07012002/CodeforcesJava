package codeforcesJava.CodeforcesJava;

import java.io.*;
import java.util.*;

public class wayTooLong 
{

	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		int tc = Integer.parseInt(in.readLine());
		String word[] = new String[tc];
		
		for(int i = 0; i<tc; i++)
			word[i] = in.readLine();
			
		for(int i = 0; i<tc; i++)
		{
			if(word[i].length() > 10)
			{
				int temp = (word[i].length()-2); 
				System.out.print(word[i].charAt(0));
				System.out.print(temp);
				System.out.println(word[i].charAt(word[i].length()-1));
			}
			
			else
			{
				System.out.println(word[i]);
			}
			
		}
			
			
		
		
	}

}
