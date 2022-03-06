package cp;

import java.io.*;

public class Magnets
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		int count = 1;
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++)
			a[i] = Integer.parseInt(in.readLine());
		
		for(int i=0; i<n-1; i++)
		{
			if(a[i]%10 == a[i+1]/10)
				count++;
		}
		
		System.out.println(count);
		
	}
}
