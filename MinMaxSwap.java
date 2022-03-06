package codeforcesJava.CodeforcesJava;

import java.io.*;
import java.util.*;

public class MinMaxSwap 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		int tc = Integer.parseInt(in.readLine());
		
		int l = 0, g1 = 0, g2 = 0;
		
		do
		{
			int n = Integer.parseInt(in.readLine());

			Integer a[] = new Integer[n];
			Integer b[] = new Integer[n];
			
			String s[] = new String[1];
			s = in.readLine().split(" ");
			
			
			for(int i=0; i<n; i++)
			{
				a[i] = Integer.parseInt(s[i]); 
				if(a[i] > l)
				{
					l = a[i];
					g1 = i;
				}
			}
			String s2[] = new String[1];
			s2 = in.readLine().split(" ");
			
			l = 0;
			for(int i=0; i<n; i++)
			{
				b[i] = Integer.parseInt(s2[i]); 
				if(b[i] > l)
				{
					l = b[i];
					g2 = i;
				}
			}
			
			int t1 = Collections.max(Arrays.asList(a));
			int t2 = Collections.max(Arrays.asList(b));
			
			if(t1>t2)
			{
				for(int i=0; i<n; i++)
				{
					if(a[i] < b[i])
					{
						int temp = a[i];
						a[i] = b[i];
						b[i] = temp;
					}
				}
				
				System.out.println(Collections.max(Arrays.asList(a)) * Collections.max(Arrays.asList(b)));
			}
			
			else if(t1<t2)
			{

				for(int i=0; i<n; i++)
				{
					if(a[i] > b[i])
					{
						int temp = b[i];
						b[i] = a[i];
						a[i] = temp;
					}
				}
				
				System.out.println(Collections.max(Arrays.asList(a)) * Collections.max(Arrays.asList(b)));
			
			}
			
			else if(t1==t2)
			{
				if(g1 == g2)
					System.out.println(t1*t2);
				if(g1 != g2)
				{
					for(int i=0; i<n; i++)
					{
						if(a[i] < b[i])
						{
							int temp = b[i];
							b[i] = a[i];
							a[i] = temp;
						}
					}
					System.out.println(Collections.max(Arrays.asList(a)) * Collections.max(Arrays.asList(b)));
					
				}
				
			}
			
			tc--;
		}while(tc!=0);
	}
}
