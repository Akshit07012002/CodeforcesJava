package codeforcesJava.CodeforcesJava;

import java.io.*;

public class Codeforces 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException
	{
		Codeforces ob = new Codeforces();
		
		System.out.println("-------------------------------------------------------------------------" );
		
		int tc = 0;
		System.out.print("\tEnter the number of test cases : ");
		tc = Integer.parseInt(in.readLine());
		
		//data
		int d = 0; //distance
		int copyd = 0; //copy of d
		int steps = 0; //total steps
		
		do
		{
			System.out.print("\tEnter the distance : ");
			d = Integer.parseInt(in.readLine());
			copyd = d;
			
			if(d>0)
			{
				if(d>5)
				{
					steps = ob.calc(d);
				}
				
				else if(d<=5) //if distance is less than 5
				{
					steps = steps + 1; 
				}
			}
			
			else
			{
				steps = 0;
			}
			
			System.out.println("\tTotal steps taken by elephant : " + steps);
			System.out.println("-------------------------------------------------------------------------" );
			tc--;
		}while(tc != 0);
		
	
	}
	
	public int calc(int d)
	{
		int steps = 0;
		int t = d;
		int j = 5;
		
		while(j >= 2)
		{
			if(t>5)
			{
				steps = t / j;
				t = t % j;
			}
			
			else if(t<=5)
			{
				steps = steps + 1;
				break;
			}
			
			j--;
		}
		
			
		return steps;
	}
	

}
