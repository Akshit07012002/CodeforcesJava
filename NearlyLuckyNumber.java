package cp;

import java.io.*;

public class NearlyLuckyNumber
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String []s = new String[1];
		s = in.readLine().split("");
		
		int a[] = new int[s.length];
		
		int count=0;
		for(int i=0; i<s.length; i++)
		{
			a[i] = Integer.parseInt(s[i]);
			
			if(a[i] == 4 || a[i] == 7)
				count++;
		}
		
		if(count==7 || count==4)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
}
