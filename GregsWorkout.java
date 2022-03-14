package codeforcesJava.CodeforcesJava;

import java.io.*;

public class GregsWorkout 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		s = in.readLine().split(" ");
		
		int i;
		int m1 = 0, m2 = 0, m3 = 0;
		
		for(i = 0; i < n; i++)
		{
			if(i==0 || i%3==0)
				m1 += Integer.parseInt(s[i]);
			if(i==1 || i%3==1)
				m2 += Integer.parseInt(s[i]);
			if(i==2 || i%3==2)	
				m3 += Integer.parseInt(s[i]);
		}
		
		int res = (int) (Math.max(m1, Math.max(m3, m2)));
		if(res == m1)
			System.out.println("chest");
		else if(res == m2)
			System.out.println("biceps");
		else if(res == m3)
			System.out.println("back");
	}
}
