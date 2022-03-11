package codeforcesJava.CodeforcesJava;

import java.io.*;
import java.util.*;

public class SumOfRoundNumbers
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		for(int tc=0; tc<t; tc++)
		{
			int n = Integer.parseInt(in.readLine());
			int nn = n;
			
			List<Integer> a = new ArrayList();
			
			int r=0, s=0, count=0, mul = 0;
			
			if(n<9)
			{
				System.out.println(1);System.out.println(n);
			}
			
			else
			{
				mul = 1;
				while(n>0)
				{
					r = n % 10;
					if(r!=0)
					{
						a.add(r*mul);
						count++;
					}
					n = n/10;
					mul = mul * 10;
				}
				
				System.out.println(count);
				
				for(int c=0; c<count; c++)
					System.out.print(a.get(c) + " ");
				
				System.out.println();
				
			}
			
		}
	}
}
