package codeforcesJava.CodeforcesJava;

import java.io.*;

public class AntonAndPolyhedrons 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		//String s[] = new String[n];
		
		int count = 0;
		
		for(int i=0; i<n; i++)
		{
			String s = in.readLine();
			if(s.equalsIgnoreCase("Tetrahedron"))
				count += 4;
			if(s.equalsIgnoreCase("Cube"))
				count += 6;
			if(s.equalsIgnoreCase("Octahedron"))
				count += 8;
			if(s.equalsIgnoreCase("Dodecahedron"))
				count += 12;
			if(s.equalsIgnoreCase("Icosahedron"))
				count += 20;
		}
		System.out.println(count);
		
	}
}
