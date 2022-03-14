package codeforcesJava.CodeforcesJava;

import java.io.*;

public class SoftDrinking 
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s[] = new String[1];
		s = in.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int l = Integer.parseInt(s[2]);
		int c = Integer.parseInt(s[3]);
		int d = Integer.parseInt(s[4]);
		int p = Integer.parseInt(s[5]);
		int nl = Integer.parseInt(s[6]);
		int np = Integer.parseInt(s[7]);
		
		int drink = 0, lime = 0, salt = 0;
		
		drink = (k*l)/nl;
		lime = c*d;
		salt = p/np;
		
		System.out.println((int)Math.min(drink, Math.min(lime, salt)) / n);
	}

}
