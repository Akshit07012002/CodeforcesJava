package codeforcesJava.CodeforcesJava;

import java.io.*;

public class Rewards 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String aa[] = new String[1];
		String bb[] = new String[1];
		
		aa = in.readLine().split(" ");
		bb = in.readLine().split(" ");
		int shelves = Integer.parseInt(in.readLine());
		
		int cups = 0, medals = 0;
		int req = 0;
		
		for(int i=0; i<3; i++)
		{
			cups += Integer.parseInt(aa[i]);
			medals += Integer.parseInt(bb[i]);
		}
		
//		if(cups>0)
//			req++;
//		if(medals>0)
//			req++;
		
		req += (cups>=5)?cups/5:(cups==0)?0:1;
		req += (medals>=10)?medals/10:(medals==0)?0:1;
		
		if(shelves >= req)
			System.out.println("YES");
		if(shelves < req) 
			System.out.println("NO");
	}
}
