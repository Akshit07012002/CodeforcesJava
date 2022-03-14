package codeforcesJava.CodeforcesJava;

import java.io.*;

public class RepeatingCipher 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		s = in.readLine().split("");
		
		int skip = 0;
		
		String word = "";
		
		for(int i=0; i<n; i=i+skip)
		{
			word = word + s[i];
			skip++;
		}
		System.out.println(word);
	}

}
