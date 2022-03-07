package codeforcesJava.CodeforcesJava;
import java.io.*;

public class DoorsAndKeys 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		for(int i=0; i<tc; i++)
		{
			String s[] = new String[1];
			s = in.readLine().split("");
			
			int r=0, g=0, b=0, R=0, G=0, B=0;
			
			for(int j=0; j<6; j++)
			{
				if(s[j].equals("R"))
					R=j;
				else if(s[j].equals("G"))
					G=j;
				else if(s[j].equals("B"))
					B=j;
				else if(s[j].equals("r"))
					r=j;
				else if(s[j].equals("g"))
					g=j;
				else 
					b=j;
			}
			if(r>R || g>G || b>B)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}