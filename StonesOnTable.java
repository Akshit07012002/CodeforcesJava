package cp;

import java.io.*;

public class StonesOnTable 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String s = in.readLine();
		
		int count = 0;
		
		for(int i=0; i<s.length()-1; i++)
			if(s.charAt(i) == s.charAt(i+1))
				count++;
		
		System.out.println(count);
	}
}
