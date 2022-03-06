package cp;

import java.io.*;

public class DoubleEndedStrings 
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		do
		{
			String a = in.readLine();
			String b = in.readLine();
			
			int count = 0;
			
			int lb = 0, ub = 0;
			
			if(a.length() > b.length())
				for(int i=0; i<a.length(); i++)
				{
					for(int j=0; j<b.length(); j++)
					{
						if(a.charAt(i) == b.charAt(j))
						{
							lb = i;
							break;
						}
							
						else
							a = a.substring(i); count++;
					}
				}
			
			System.out.println(count);
			
			
			tc--;
		}while(tc!=0);
	}

}
