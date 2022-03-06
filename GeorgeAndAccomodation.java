package codeforcesJava.CodeforcesJava;

import java.io.*;

public class GeorgeAndAccomodation 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		int a[][] = new int[n][2];
		
		String s[] = new String[1];
		
		int count = 0;
		
		for(int i=0; i<n; i++)
		{
			s = in.readLine().split(" ");
			a[i][0] = Integer.parseInt(s[0]);
			a[i][1] = Integer.parseInt(s[1]);
			
			if( (a[i][1] - a[i][0]) >= 2)
				count++;
		}
		
		System.out.println(count);
	}
}
