package cp;

import java.io.*;

public class Cossack 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s[] = new String[1];
		s = in.readLine().split(" ");
		
		if(Integer.parseInt(s[1]) >= Integer.parseInt(s[0]) &&  Integer.parseInt(s[2]) >= Integer.parseInt(s[0]))
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
}
