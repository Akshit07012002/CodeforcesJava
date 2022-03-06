package codeforcesJava.CodeforcesJava;
import java.io.*;
import java.util.*;

public class TwoIntegers 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		long tc = Integer.parseInt(in.readLine());
		
		do
		{
			String s[] = new String[1];
			s = in.readLine().split(" ");
			
			long a = Long.parseLong(s[0]);
			long b = Long.parseLong(s[1]);
			
			long diff = 0; long count = 0;
			
			if(a>b)
			{
				diff = a-b;
				count = (diff%10!=0) ? diff/10 + 1: diff/10;
			}
			else if(a<b)
			{
				diff = b-a;
				count = (diff%10!=0) ? diff/10 + 1: diff/10;
			}
			else
				count = 0;
			
			System.out.println(count);
			
			tc--;
		}while(tc!=0);
	}
}
