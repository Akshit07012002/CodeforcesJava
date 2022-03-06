package cp;

import java.io.*;
import java.util.*;
public class divByTwo 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = 0;
		
		tc = Integer.parseInt(in.readLine());
		
		do
		{
			int n = Integer.parseInt(in.readLine());
			
			String s[] = new String[1];
			s = in.readLine().split(" ");
			
			String ans = "NO";
			
			long a[] = new long[n];
			
			for(int i=0; i<n; i++)
				a[i] = Long.parseLong(s[i]);
			
			Arrays.sort(a);
			long iter = a[0];
			int flag = 0;
			long count = 0, count1 = 0;
			for(int i=n-1; i>0; i--)
			{
				if(a[i] - a[i-1] == 1)
					count1++;
					
			}
					
			if(count1==n-1)
				ans = "YES";
		
				for(long i=iter, j=0; i<iter+n; i++,j++)
				{
					while(i != a[(int)j])
					{
						a[(int)j] = a[(int)j] >> 1;	
						if(a[(int)j]< i)
						{
							ans = "NO"; break;
						}
						else
						{
							count++;
						}
							
					}
				}
				
				if(count==n-1)
					ans = "YES";
			
			
			
			
//			Arrays.sort(a);
//			
//			int count = 0;
//			
//			for(int i=n-1; i>0; i--)
//			{
//				if(a[i] - a[i-1] == 1)
//					count++;
//				
//				else
//				{
//					while(a[i]-a[i-1]!=1)
//						a[i] = a[i] >> 1;
//				}
//			}
//			
//			if(count==n-1)
//				ans = "YES";
			
			System.out.println(ans);
			
			tc--;
		}while(tc!=0);
	}

}

