package cp;

import java.io.*;

public class FafaCompany 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		int count = 0;
		
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
				count++;
		}
		
		System.out.println(count);
	}
}
