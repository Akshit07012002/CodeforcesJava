package cp;

import java.io.*;
import java.util.Arrays;

public class SortingParts 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		do
		{
			int n = Integer.parseInt(in.readLine());
			int a[] = new int[n];
			
			String s[] = new String[1];
			s = in.readLine().split(" ");
			
			int max = 0;
			int min = 999999999;
			
			for(int i=0; i<n; i++)
			{
				a[i] = Integer.parseInt(s[i]);
//				max = (int)Math.max(a[i],max);
//				min = (int)Math.min(a[i],min);
			}
			
			Arrays.sort(a);
				
			System.out.println(a[n-1]-a[0]);
			
			tc--;
		}while(tc!=0);
		
	}
}
