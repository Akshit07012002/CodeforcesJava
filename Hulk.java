package codeforcesJava.CodeforcesJava;

import java.io.*;

public class Hulk
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
			
		for(int i=1; i<=n; i++)	
		{
			if(i%2==1)
				System.out.print("I hate ");
			if(i%2==0)
				System.out.print("I love ");
			if(i!=n)
				System.out.print("that ");
		}
		System.out.print("it");
	}
}	
