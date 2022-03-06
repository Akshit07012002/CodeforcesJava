package codeforcesJava.CodeforcesJava;

import java.io.*;

public class NextRound
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n=0, k=0;
		String ip1[] = new String[1];
		
		ip1 = in.readLine().split(" ");
		
		n = Integer.parseInt(ip1[0]);
		k = Integer.parseInt(ip1[1]);
		
		String ip2[] = new String[n];
		int arr[] = new int[n];
		
		ip2 = in.readLine().split(" ");
		
		int count = 0;
		
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(ip2[i]);
		
		for(int i=0; i<n; i++)
			if(arr[i]>=arr[k-1] && arr[i]>0)
				count++;

		System.out.println(count);	
	}
}
