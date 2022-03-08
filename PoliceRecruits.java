package codeforcesJava.CodeforcesJava;

import java.io.*;

public class PoliceRecruits 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		s = in.readLine().split(" ");
		
		int police = 0, crime = 0, count = 0;
		
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = Integer.parseInt(s[i]);
			if(a[i] == -1)
			{
				
				if(police<=0)
					count++;
				if(police>0)
					crime++;
				if(police>=crime)
				{
					police -= crime; crime = 0;
				}
				//System.out.println(a[i] + " : " + police + " " + crime + " " + count);
			}
			if(a[i] > 0)
			{
				police += a[i];
				
				//System.out.println(a[i] + " : " + police + " " + crime + " " + count);
			}
			
		}
		
		System.out.println(count);
	}
}
