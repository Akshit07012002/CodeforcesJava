package codeforcesJava.CodeforcesJava;
import java.io.*;

public class EasyProblem 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		s = in.readLine().split(" ");
		
		int flag = 0;
		
		for(int i=0; i<n; i++)
			if(Integer.parseInt(s[i]) == 1)
			{
				flag = 1; break;
			}
		
		if(flag == 1)
			System.out.println("HARD");
		else
			System.out.println("EASY");
	}
}
