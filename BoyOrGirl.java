package codeforcesJava.CodeforcesJava;

import java.io.*;

public class BoyOrGirl
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s = in.readLine();
		
		int flag = 0;
		int count = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			for(int j=i+1; j<s.length(); j++)
			{
				if(ch == s.charAt(j))
				{
					flag +=1; break;
				}
					
			}
			
			if( flag == 0 )
				count += 1;
			flag = 0;
		}
		
		if(count%2==0)
			System.out.println("CHAT WITH HER!");
		else if(count%2==1)
			System.out.println("IGNORE HIM!");
	}
}