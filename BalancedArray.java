package codeforcesJava.CodeforcesJava;

import java.io.*;

public class BalancedArray 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		do
		{
			int n = Integer.parseInt(in.readLine());
			
			int a[] = new int[n];
			
			int sum1=0, sum2=0;
			
			int eve=2, odd=1;
			
			for(int i=0; i<n/2; i++)
			{
				a[i] = eve; sum1+=a[i]; eve+=2;
			}
				
			for(int i=n/2; i<n-1; i++)
			{
				a[i] = odd; sum2+=a[i]; odd+=2;
			}
			
			a[n-1] = sum1 - sum2; 
			
			if(a[n-1]%2!=0)
			{
				System.out.println("YES");
				for(int i=0; i<n; i++)
					System.out.print(a[i] + " ");
				System.out.println();
			}
			else
				System.out.println("NO");
			
			tc--;
		}while(tc!=0);
	}
}
