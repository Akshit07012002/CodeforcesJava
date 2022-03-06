package cp;
import java.io.*;
public class Pangram
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String x = in.readLine();
		int k = 0;
		for(char ch='a';ch<='z';ch++)
		{
			if(x.toLowerCase().contains(String.valueOf(ch)))
				k++;
		}
		if(k==26)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}

//package cp;
//
//import java.io.*;
//
//public class Pangram 
//{
//	public static void main(String []args)throws IOException
//	{
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(in.readLine());
//		
//		String a = in.readLine();
//		a.toUpperCase();
//		
//		String s[] = new String[1];
//		s = a.split("");
//		
//		int b[] = new int[26]; 
//		for(int j=0; j<26; j++)
//			b[j] = 0;
//		
//		int flag = 0;
//		
//		for(int i=0; i<n; i++)
//			for(int j=65; j<=90; j++)
//				if(s[i]==String.valueOf(j))
//					b[j] = 1;
//
//		for(int j=0; j<26; j++)
//			if(b[j] == 0)
//				flag++;
//		if(flag == 0)	
//			System.out.print("NO");
//		else
//			System.out.print("YES");
//	}
//}
