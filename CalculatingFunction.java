package cp;

import java.io.*;

public class CalculatingFunction 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(in.readLine());
		
		if(n%2==0)
			System.out.println((n/2));
		else
			System.out.println(-(n+1)/2);
	}
}
