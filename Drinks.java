package codeforcesJava.CodeforcesJava;

import java.io.*;

public class Drinks 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		s = in.readLine().split(" ");
		
		double avg = 0.0d;
		
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = Integer.parseInt(s[i]);
			avg += a[i];
		}
		
		avg = avg/n;
		
		System.out.println(avg);
	}
}
