package cp;

import java.io.*;
import java.math.BigInteger;

public class GiftFixing
{	
	public static void main(String []args)throws IOException
	{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		do
		{
			int n = Integer.parseInt(in.readLine());
			
			String sa[] = new String[1];
			sa = in.readLine().split(" ");
			
			String sb[] = new String[1];
			sb = in.readLine().split(" ");
			
			BigInteger a[] = new BigInteger[n];
			BigInteger b[] = new BigInteger[n];
			
			BigInteger minA = new BigInteger("99999999999999999999");
			BigInteger minB = new BigInteger("99999999999999999999");
			
			for(int i=0; i<n; i++)
			{
				a[i] = new BigInteger(sa[i]);
				b[i] = new BigInteger(sb[i]);
				
				if(minA.compareTo(a[i]) > 0)
					minA = a[i];
				if(minB.compareTo(b[i]) > 0)
					minB = b[i];
			}
			
			

			//System.out.println(minA + " " + minB);	
						
			BigInteger moves = BigInteger.ZERO;
			
			for(int i=0; i<n; i++)
			{
				BigInteger d1 = a[i].subtract(minA);
				BigInteger d2 = b[i].subtract(minB);
				
				moves = moves.add(d1.max(d2));
			}	
			System.out.println(moves);			
			
			tc--;
		}while(tc!=0);
			
	}

}
