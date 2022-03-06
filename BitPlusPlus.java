package codeforcesJava.CodeforcesJava;

import java.io.*;

public class BitPlusPlus 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		int x = 0;
		
		String s[] = new String[n];
		
		for(int i=0; i<n; i++)
			s[i] = in.readLine();
		
		for(int i=0; i<n; i++)
		{
			if(s[i].charAt(1) == '+')
				x++;
			else if(s[i].charAt(1) == '-')
				x--;
		}
		
		System.out.println(x);
	}
}
