package codeforcesJava.CodeforcesJava;

import java.io.*;

public class MishkaGame 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		int m[] = new int[n];
		int c[] = new int[n];
		
		int cm = 0;
		int cc = 0;
		
		for(int i=0; i<n; i++)
		{
			String ip[] = new String[1];
			ip = in.readLine().split(" ");
			 
			 m[i] = Integer.parseInt(ip[0]);
			 c[i] = Integer.parseInt(ip[1]);
			 
			 if(m[i] > c[i])
				 cm++;
			 
			 else if(m[i] < c[i])
				 cc++;
		}
		
		if(cc>cm)
			System.out.println("Chris");
		else if(cm>cc)
			System.out.println("Mishka");
		else
			System.out.println("Friendship is magic!^^");
	}
}
