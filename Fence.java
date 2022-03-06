package codeforcesJava.CodeforcesJava;

import java.io.*;

public class Fence 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s[] = new String[1];
		s = in.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]); 
		int h = Integer.parseInt(s[1]);
		int a[] = new int[n];
		
		String s2[] = new String[1];
		s2 = in.readLine().split(" ");
		
		int minWidth = 0;
		
		for(int i=0; i<n; i++)
		{
			a[i] = Integer.parseInt(s2[i]);
			if(a[i] > h)
				minWidth+=2;
			else
				minWidth+=1;
		}
			
		System.out.println(minWidth);
	}
}
