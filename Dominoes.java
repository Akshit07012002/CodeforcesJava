package codeforcesJava.CodeforcesJava;

import java.io.*;

public class Dominoes 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String ip[] = new String[1];
		
		ip = in.readLine().split(" ");
		
		int m = Integer.parseInt(ip[0]);
		int n = Integer.parseInt(ip[1]);
		
		if(n>=1 && m>=1 && n<=16 && m<=n)
				System.out.println((m*n)/2);
					
	}
}
