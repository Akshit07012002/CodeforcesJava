package cp;

import java.io.*;

public class AntonAndDanik 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		s = in.readLine().split("");
		
		int a = 0, d = 0;
		
		for(int i=0; i<n; i++)
		{
			if(s[i].equals("A"))
				a += 1;
			if(s[i].equals("D"))
				d += 1;
		}
		
		if(a>d)
			System.out.println("Anton");
		else if(a<d)
			System.out.println("Danik");
		else
			System.out.println("Friendship");
	}
}
