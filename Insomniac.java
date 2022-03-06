package cp;

import java.io.*;

public class Insomniac 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(in.readLine());
		int l = Integer.parseInt(in.readLine());
		int m = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		int d = Integer.parseInt(in.readLine());
		
		int count = 0;
		
		if(k==1 || l==1 || m==1 || n==1)
			System.out.println(d);
		else
		{
			for(int i=1; i<=d; i++)
				if(i%k==0 ||i%l==0 ||i%m==0 ||i%n==0)
					count++;
			System.out.println(count);
		}
	}
}
