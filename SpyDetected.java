package codeforcesJava.CodeforcesJava;

import java.io.*;
import java.util.Arrays;

public class SpyDetected 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		
		for(int i=0; i<t; t++)
		{
			int n = Integer.parseInt(in.readLine());
			
			s = in.readLine().split(" ");
			
			int temp = Integer.parseInt(s[0]);;
			int flag = 0, index = 0;
			
			if(Integer.parseInt(s[0]) == Integer.parseInt((s[n/2])) || Integer.parseInt(s[1])== Integer.parseInt((s[n/2])) )
				temp = Integer.parseInt(s[n/2]);
			
			else if(Integer.parseInt(s[0]) == Integer.parseInt((s[n/2-1]))  || Integer.parseInt(s[1])== Integer.parseInt((s[n/2-1])) )
				temp = Integer.parseInt(s[n/2-1]);
			
			for(int j=1; j<n; j++)
				if(Integer.parseInt(s[j]) != temp)
					index = j+1;	
			
			if(index == 0)
				index = 1;
			System.out.println(index);
			
			
//			if(Integer.parseInt(s[0])== Integer.parseInt((s[n/2])) || Integer.parseInt(s[1])== Integer.parseInt((s[n/2])) )
//				System.out.println(Arrays.asList(s).indexOf(s[n/2]));
//			
//			else if(Integer.parseInt(s[0])== Integer.parseInt((s[n/2-1]))  || Integer.parseInt(s[1])== Integer.parseInt((s[n/2-1])) )
//				System.out.println(Arrays.asList(s).indexOf(s[n/2-1]));
//			
		}
	}
}
