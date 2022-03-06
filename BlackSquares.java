package codeforcesJava.CodeforcesJava;

import java.io.*;

public class BlackSquares
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String []ip = new String[1];
		ip = in.readLine().split(" ");
		
		int a[] = new int[4];
		
		for(int i=0; i<4; i++)
			a[i] = Integer.parseInt(ip[i]);
		
		String s[] = new String[1];
		s = in.readLine().split("");
		
		long cal = 0;
		
		for(int i=0; i<s.length; i++)
		{
			if(s[i].equals("1") == true)
				cal += a[0];
			if(s[i].equals("2") == true)
				cal += a[1];
			if(s[i].equals("3") == true)
				cal += a[2];
			if(s[i].equals("4") == true)
				cal += a[3];
		}
		
		System.out.println(cal);
	}
}
