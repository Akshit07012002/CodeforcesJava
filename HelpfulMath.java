package cp;

import java.util.*;
import java.io.*;

public class HelpfulMath 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s = in.readLine();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch)==true)
				a.add(Character.getNumericValue(ch));
		}
		
		for(int i=0; i<a.size()-1; i++)
			for(int j=0; j<a.size()-1-i; j++)
				if(a.get(j) > a.get(j+1))
				{
					int t = a.get(j);
					a.set(j, a.get(j+1));
					a.set(j+1, t);
				}
		
		for(int x=0; x<a.size()-1; x++)
			System.out.print(a.get(x) + "+");
		System.out.print(a.get(a.size()-1));
	}
}
