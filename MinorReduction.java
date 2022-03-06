package cp;

import java.io.*;

public class MinorReduction 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = 0;
		
		tc = Integer.parseInt(in.readLine());
		
		do
		{
			int a[]; int max=0;
			String s[] = in.readLine().split("");
			a = new int[s.length];
			
			
			for(int i=0; i<s.length; i++)
				a[i] = Integer.parseInt(s[i]);
			
			int flag = 0;
			for(int i=s.length-2; i>=0; i--)
			{
				max = a[i] + a[i+1];
				if( max > 9 )
				{
					flag++;
					a[i+1] = max%10;
					max = max/10;
					a[i] = max;
					break;
				}
			}	
			if( flag > 0 )
				continue;
				
			System.out.print(a[0] + a[1]);			
				
			for(int i=2; i<s.length-1; i++)
				System.out.print(a[i]);
		
			tc--;
		}while(tc!=0);
	}
}
