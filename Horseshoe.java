package codeforcesJava.CodeforcesJava;

import java.io.*;
import java.util.Arrays;

public class Horseshoe 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s[] = new String[1];
		s = in.readLine().split(" ");
		
		long a[] = new long[4];
		for(int i=0; i<=3; i++)
			a[i] = Long.parseLong(s[i]);
		
		int count = 0;
		
		Arrays.sort(a);
		
		for(int i=0; i<3; i++)
			if(a[i] == a[i+1])
				count++;
		
		System.out.println(count);
	}	
}
