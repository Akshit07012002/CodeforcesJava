package cp;

import java.io.*;

public class Div7 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		do
		{
			int n = Integer.parseInt(in.readLine());
					
			if(n%7==0)
				System.out.println(n);
			if(n%7!=0)
			{
				int temp = n%7;
				int tt =7-temp;
				if(n%10>=7)
					System.out.println(n-temp);
				else if(n%10<=3)
					System.out.println(n+tt);
				else
				{
					int z=n%10;
					if(z>=temp)
						System.out.println(n-temp);
					else
						System.out.println(n+tt);
				}
//				while(n>0)
//				{
//					temp = n%10;
//					
//					for(int i=0; i<10; i++)
//					{
//						temp +=i;
//						if(temp % 7 == 0)
//						{
//							res = temp; flag = 1; break;
//						}
//							
//					}
//					
//					if(flag==1)
//					{
//						System.out.println(res); break;
//					}
//					else
//						n = n/10;
//				}
			}
			
			
//			if(n%7==0)
//				System.out.println(n);
//			
//			else
//			{
//				int tt = n % 7;
//				if(tt <= 3.5)
//					res = n - tt;
//				else
//					res = n - tt + 7;
//
//				System.out.println(res);
//			}
			
			tc--;
		}while(tc!=0);
		
	}
}
