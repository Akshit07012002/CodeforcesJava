package codeforcesJava.CodeforcesJava;

import java.io.*;
public class makeAP
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = 0;
		
		tc = Integer.parseInt(in.readLine());
		
		do
		{
			long a=0; long b=0; long c=0; long d=0;
			
			String res = "NO";
			
			String s[] = new String[1];
			s = in.readLine().split(" ");
			
			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);
			c = Integer.parseInt(s[2]);
			
			d = b - (c-b);
			if( d%a==0 && d>=a )
				res = "YES";
			
			d = a + (c-a)/2;
			if( (c-a)%2==0 && d>=b && d%b==0 )
				res = "YES";
			
			d = a+2*(b-a);
			if( d%c==0 && d>=c )
				res = "YES";
			
			System.out.println(res);
			tc--;
		}while(tc!=0);
	}

}
