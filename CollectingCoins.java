package cp;

import java.io.*;
import java.util.Arrays;

public class CollectingCoins 
{
	
	public static void main(String []args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		for(int j=0; j<tc; j++)
		{
			int n=0;
			int arr[] = new int[3];
			
			String s[] = new String[1];
			s = in.readLine().split(" ");
			
			System.out.println();
			for(int i=0; i<=2; i++)
				arr[i] = Integer.parseInt(s[i]);
			
			n = Integer.parseInt(s[3]);
			Arrays.sort(arr);
			
			n = n - ((2*arr[2]) - (arr[1]) - (arr[0]));
			
			if( n < 0 || n % 3 != 0 )
				System.out.print("NO");
			else
				System.out.print("YES");
			
		}
	}
}
