package cp;

import java.io.*;

public class Playoff 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		do
		{
			String s[] = new String[1];
			s = in.readLine().split(" ");
			int a[] = new int[4];
			
			for(int i=0; i<4; i++)
				a[i] = Integer.parseInt(s[i]); 
		
			
			int fmax = (int)Math.max(a[0],a[1]);
			int smax = (int)Math.max(a[2],a[3]);

			int fmin = (int)Math.min(a[0],a[1]);
			int smin = (int)Math.min(a[2],a[3]);
					
			if( fmin > smax || fmax < smin)
				System.out.println("NO");
			else
				System.out.println("YES");				
			
			tc--;
		}while(tc!=0);
	}
}
