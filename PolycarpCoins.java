package cp;

import java.io.*;

public class PolycarpCoins 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		do
		{
			int n = Integer.parseInt(in.readLine());
			
			int c1 = (int)Math.ceil(n/3);
			
			int c2 = (n - c1)/2;
			
			if( !(c1 + (2*c2) == n) )
				c1++;	
//			
//			if(n%10==0 && n%3!=0 || n==1)
//				c1++;
			System.out.println(c1 + " " + c2);
			tc--;
		}while(tc!=0);
	}
}
