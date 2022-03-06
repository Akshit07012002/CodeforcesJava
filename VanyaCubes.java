package codeforcesJava.CodeforcesJava;

import java.io.*;

public class VanyaCubes 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
			
		int i=2,c=0,l=1;
		 
		while(l<= n)
		{
			n=n-l;
	        c++;
	        l+=i;
	        i++;
		}
		
		System.out.println(c);
		
	}
}
