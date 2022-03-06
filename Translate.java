package cp;

import java.io.*;

public class Translate 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder(in.readLine());
		String t = in.readLine();
		
		String rev = sb.reverse().toString();
		
		if(rev.compareTo(t)==0)
			System.out.println("YES");
		else 
			System.out.println("NO");
	}
}