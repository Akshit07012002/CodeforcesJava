package cp;

import java.io.*;

public class Team 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = 0;
		
		tc = Integer.parseInt(in.readLine());
		
		int a[] = new int[3];
		int count = 0;
		
		do
		{
			String str = in.readLine();
			String s[] = str.trim().split("\\s+");
			
			for( int num = 0; num < s.length; num++ )
				a[num] = Integer.parseInt(s[num]);	
			
			if(a[0] == 1 && a[1] == 1|| a[0] == 1 && a[2] == 1 || a[1] == 1 && a[2] == 1)
				count++;
			tc--;
		}while(tc!=0);
		
		System.out.println(count);
	}

}
