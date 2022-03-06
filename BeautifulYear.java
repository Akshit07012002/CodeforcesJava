package codeforcesJava.CodeforcesJava;

import java.io.*;

public class BeautifulYear 
{
    public static void main(String[] args) throws IOException
    {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
         String year = in.readLine(); 
        for(int i=1000;i<=9000;i++)
        {
            year = String.valueOf(Integer.parseInt(year) + 1);
            if(year.charAt(0)!=year.charAt(1) && year.charAt(0)!=year.charAt(2)
               && year.charAt(0)!=year.charAt(3) && year.charAt(1)!=year.charAt(2)
               && year.charAt(1)!=year.charAt(3) && year.charAt(2)!=year.charAt(3))
                break;
        }
         System.out.println((year));
    }
}