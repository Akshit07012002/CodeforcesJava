package cp;

import java.io.*;

public class BeautifulMatrix 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s[] = new String[5];
		
		int a[][] = new int[5][5];
		int count = 0;
		
		for(int i=0; i<5; i++)
		{
			s = in.readLine().split(" ");
			for(int j=0; j<5; j++)
				a[i][j] = Integer.parseInt(s[j]);
		}
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
				if(a[i][j]==1)
				{
					if(i==4 || i==0)
						count += 2;
					if(j==4 || j==0)
						count += 2;
					if(i==3 || i==1)
						count += 1;
					if(j==3 || j==1)
						count += 1;
					
					break;
				}
		}
		
		System.out.println(count);				
	}

}
