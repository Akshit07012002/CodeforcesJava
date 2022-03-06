package codeforcesJava.CodeforcesJava;

import java.io.*;

public class Tram 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		
		int cap = 0;
		int max = 0;
		
		for(int i=0; i<n; i++)
		{
			s = in.readLine().split(" ");			
			cap = cap - Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
			if(cap>max)
				max = cap;
		}
		
		System.out.println(max);
		
	}
}
