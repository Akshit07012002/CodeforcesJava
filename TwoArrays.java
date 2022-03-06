package codeforcesJava.CodeforcesJava;

import java.io.*;
import java.util.*;

public class TwoArrays 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		do
		{
			String ip[] = new String[1];
			ip = in.readLine().split(" ");
			
			int n = Integer.parseInt(ip[0]);
			int k = Integer.parseInt(ip[1]);
			
			ip = in.readLine().split(" ");
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = Integer.parseInt(ip[i]);
			
			ip = in.readLine().split(" ");
			int b[] = new int[n];
			
			for(int i=0; i<n; i++)
				b[i] = Integer.parseInt(ip[i]);
			
			int max = a[0];
			
			Arrays.sort(a); Arrays.sort(b); 
			
			for (int i = 0; i < n / 2; i++) 
			{
				int temp = b[i];
				b[i] = b[n - i - 1];  
				b[n - i - 1] = temp;          
		    }
			
			int sum = 0;
			
			for(int i=0; i<n; i++)
			{
				if(i < k)
					sum += (int)Math.max(a[i], b[i]);
				else 
					sum += a[i];
			}
			
			System.out.println(sum);
			
			tc--;
		}while(tc>0);
		
	}
}
