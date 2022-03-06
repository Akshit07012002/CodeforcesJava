package codeforcesJava.CodeforcesJava;

import java.io.*;
import java.util.*;

public class UniqueBidAuction 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		long tc = Long.parseLong(in.readLine());
		
		do
		{
			int n = Integer.parseInt(in.readLine());
			
			String s[] = new String[1];
			s = in.readLine().split(" ");
			
			int a[] = new int[n]; int b[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = Integer.parseInt(s[i]);
			
			for(int i=0; i<n; i++)
				System.out.print(a[i]+ " ");
			
			System.out.println();
			
			for(int i=0; i<n; i++)
				for(int j=i+1; j<n; j++)
					if(a[j] != a[i])
						b[i] = a[i];
			
			for(int i=0; i<n; i++)
				System.out.print(b[i]+ " ");
			
			System.out.println();
			
			if(b.length == 0)
				System.out.println(-1);
			else
			{
				Arrays.sort(b);
				System.out.println(b[0]);
			}
			
//			Set<Integer> data = new HashSet<>();
//			for(int i=0; i<n; i++)
//				data.add(a[i]);
//			
//			Object ob = Collections.min(data);
//			
//			System.out.println(ob);
			
			tc--;
		}while(tc!=0);
	}
}
