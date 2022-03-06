package codeforcesJava.CodeforcesJava;

import java.io.*;

public class UltraFastMathematician 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String a[] = new String[1];
		String b[] = new String[1];
		
		a = in.readLine().split("");
		b = in.readLine().split("");
		
		for(int i=0; i<a.length; i++)
		{
			if(Integer.parseInt(a[i]) != Integer.parseInt(b[i]))
				System.out.print(1);
			else
				System.out.print(0);
		}
	}
}
