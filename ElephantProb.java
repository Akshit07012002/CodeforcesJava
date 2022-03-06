
package codeforcesJava.CodeforcesJava;

import java.io.*;
import java.util.*;

public class ElephantProb
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException
	{		
		
	
		//data
		int d = 0; //distance
		int steps = 0; //total steps
		
		
			
			d = Integer.parseInt(in.readLine());
			
			if(d<=5 && d>0)
				steps = 1;
		
			else if(d>5)
			{
				if(d % 5 == 0)
				{
					steps = d / 5;
				}
				
				else
				{
					steps = (int)Math.floor(d/5);
					steps = steps + 1;
				}
			}
			
			System.out.println(steps);
			
		
	
	}	

}
