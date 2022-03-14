package codeforcesJava.CodeforcesJava;

import java.io.*;

public class NearestInterestingNumber 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int aa = Integer.parseInt(in.readLine());
		
		NearestInterestingNumber ob = new NearestInterestingNumber();
		
		while(ob.sum(aa)%4!=0)
			aa++;
		System.out.println(aa);	
	}
	
	public int sum(int a)
	{
		int r = 0, s = 0;
		
		while(a!=0)
		{
			r = a % 10;
			s += r;
			a /= 10;
		}
		return s;
	}
}
