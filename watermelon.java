package codeforcesJava.CodeforcesJava;

import java.io.*;
public class watermelon 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		n = Integer.parseInt(in.readLine());
	
		if(n%2==0 && n!=2)
			System.out.println("YES");
		else 
			System.out.println("NO");
	}
}
