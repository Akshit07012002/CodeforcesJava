package cp;

import java.io.*;

public class NotShading
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		for(int x=0; x<tc; x++)
		{
			String ip[] = new String[1];
			ip = in.readLine().split(" ");
			
			int n = Integer.parseInt(ip[0]);
			int m = Integer.parseInt(ip[1]);
			int r = Integer.parseInt(ip[2]);
			int c = Integer.parseInt(ip[3]);
//			r--; c--;
			r-=1; c-=1;
			 
	        boolean [][]matrix = new boolean[n][m];
	        boolean hasBlack = false;
	 
	        for (int j = 0; j < n; j++) {
	            String line = in.readLine();
	            for (int k = 0; k < m; k++) {
	                matrix[j][k] = (line.charAt(k) == 'B');
	                hasBlack |= matrix[j][k];
	            }
	        }
	        if (!hasBlack) {
	            System.out.println(-1);
	        } else if (matrix[r][c]) {
	        	System.out.println(0);
	        } else {
	            boolean okay = false;
	 
	            for (int j = 0; j < n; j++) {
	                okay |= matrix[j][c];
	            }
	 
	            for (int k = 0; k < m; k++) {
	            	okay |= matrix[r][k];
	            }
	 
	            if (okay) {
	            	System.out.println(1);
	            } else {
	            	System.out.println(2);
	            }
	        }
		}
	}
}
	        
//			String a[][] = new String[n][m];
//			
//			String ip2[] = new String[n];
//			
//			int countB = 0;
//			
//			for(int i=0; i<n; i++)
//			{
//				ip2 = in.readLine().split("");
//				for(int j=0; j<m; j++)
//				{
//					a[i][j] = (ip2[j]);
//					if(a[i][j].equals("B"))
//						countB++;
//				}
//					
//			}
//			
//			
//			if(countB > 0)
//			{
//				if(a[r][c].equals("B"))
//					steps[x] = 0;
//				else if(a[r+1][c].equals("B") || a[r-1][c].equals("B") || a[r][c+1].equals("B") || a[r][c-1].equals("B"))
//					steps[x] = 1;
//				else if(a[r+1][c+1].equals("B") || a[r-1][c-1].equals("B") || a[r-1][c+1].equals("B") || a[r+1][c-1].equals("B"))
//					steps[x] = 2;
//			}
//			
//			if(countB == 0)
//				steps[x] = -1;
//	
//		}
//			
//		for(int x=0; x<tc; x++)
//			System.out.println(steps[x]);
	

