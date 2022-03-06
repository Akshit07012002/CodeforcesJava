package codeforcesJava.CodeforcesJava;

import java.io.*;
import java.util.*;

public class MoreRam 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		do
		{
			String s[] = new String[1];
			s = in.readLine().split(" ");
			
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			
			int a[] = new int[n];
			int b[] = new int[n];
			
			String s2[] = new String[1];
			s2 = in.readLine().split(" ");
			
			for(int i=0; i<n; i++)
				a[i] = Integer.parseInt(s2[i]);
			
			String s3[] = new String[1];
			s3 = in.readLine().split(" ");
			
			for(int i=0; i<n; i++)
				b[i] = Integer.parseInt(s3[i]);
			
			for(int i=0; i<n; i++)
				for(int j=0; j<n-1-i; j++)
					if(a[j] > a[j+1])
					{
						int t = a[j];
						a[j] = a[j+1];
						a[j+1] = t;
						
						int t2 = b[j];
						b[j] = b[j+1];
						b[j+1] = t2;
					}
			
//			for(int i=0; i<n; i++)
//				System.out.println(a[i] + " " + b[i]);
			
			for(int i=0; i<n; i++)
				if(a[i] <= k)
					k = k + b[i];
			
			
			System.out.println(k);
			tc--;
		}while(tc!=0);
	}
}
