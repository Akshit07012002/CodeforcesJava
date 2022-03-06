package codeforcesJava.CodeforcesJava;

import java.io.*;
public class NewYear 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int x=0, y=0, z=0;
		
		String ip1[] = new String[1];
		ip1 = in.readLine().split(" ");
		
		x = Integer.parseInt(ip1[0]);
		y = Integer.parseInt(ip1[1]);
		z = Integer.parseInt(ip1[2]);
		
		int dist = 0; 
		
		if(x>=1 && y>=1 && z>=1)
		{
			if(x>y && x<z)
					dist = (z-x) + (x-y);
			else if(x>z && x<y)
					dist = (y-x) + (x-z);
			else if(y>x && y<z)
					dist = (z-y) + (y-x);
			else if(y>z && y<x)
					dist = (x-y) + (y-z);			
			else if(z>x && z<y)
					dist = (y-z) + (z-x);
			else if(z>y && z<x)
					dist = (x-z) + (z-y);		
		}
	
		
		System.out.println(dist);
		
	}

}

