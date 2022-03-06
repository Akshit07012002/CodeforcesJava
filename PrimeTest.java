package codeforcesJava.CodeforcesJava;
import java.io.*;

public class PrimeTest 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		for(int i = 3; i < n ; i++)
		{
			if(i == 6*n+1 || i == 6*n+5)
				System.out.print(i + " ");
		}
		
	}
}
