package cp;

import java.io.*;

public class Presents 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		s = in.readLine().split(" ");
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++)
			a[Integer.parseInt(s[i]) - 1] = i+1; 
		
		for(int i=0; i<n; i++)
			System.out.print( a[i] + " " );
	}
}
