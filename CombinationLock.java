package codeforcesJava.CodeforcesJava;

import java.io.*;

public class CombinationLock 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String a[] = new String[1];
		a = in.readLine().split("");
		
		String b[] = new String[1];
		b = in.readLine().split("");
		
		int count = 0;
		
		for(int i=0; i<n; i++)
		{
			if((int)Math.abs(Integer.parseInt(a[i]) - Integer.parseInt(b[i])) >=5)
				count += 10 - (int)Math.abs(Integer.parseInt(a[i]) - Integer.parseInt(b[i]));
			else
				count += (int)Math.abs(Integer.parseInt(a[i]) - Integer.parseInt(b[i]));
		}
		System.out.println(count);
	}
}
