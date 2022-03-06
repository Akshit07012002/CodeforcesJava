package codeforcesJava.CodeforcesJava;

import java.io.*;

public class WrongSub 
{
	public static void main(String []args) throws IOException
	{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String ip[] = new String[1];
		
		ip = in.readLine().split(" ");
		
		int n = Integer.parseInt(ip[0]);
		int k = Integer.parseInt(ip[1]);
		
		int res = n;
		
		while(k>0)
		{
			int ld = res % 10;
			
			if(ld != 0)
				res--;
			if(ld == 0)
				res/=10;
			
			k--;
		}
		
		System.out.println(res);
		
	}
}
