package codeforcesJava.CodeforcesJava;

import java.io.*;

public class ArrivalOfGeneral
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		s = in.readLine().split(" ");
		
		int max = 0, maxPos = 0; int min = 999999, minPos = 0;
		int count = 0;
		
		for(int i=0; i<n; i++)
		{
			if(Integer.parseInt(s[i]) > max)
			{
				max = Integer.parseInt(s[i]) ; maxPos = i;
			}
				
			if(Integer.parseInt(s[i]) <= min)
			{
				min = Integer.parseInt(s[i]) ; minPos = i;
			}
		}
		if(maxPos>minPos)
			count = maxPos + ((n-1)-minPos) - 1;
		else
			count = maxPos + ((n-1)-minPos);
		System.out.println(count);	
	}
}
