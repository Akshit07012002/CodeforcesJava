package codeforcesJava.CodeforcesJava;

import java.io.*;

public class DislikeOfThrees 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		do
		{
			int k = Integer.parseInt(in.readLine());
			
			int count = 0;
			
			for(int i=1; i<=k; i++)
			{
				int t = i % 10;
				if(t == 3 || i%3==0) { k++; continue;}
				else count=i;
			}
			System.out.println(count);
			
			tc--;
		}while(tc!=0);
	}
}
