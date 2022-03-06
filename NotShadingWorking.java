package codeforcesJava.CodeforcesJava;

import java.util.*;
import java.io.*;
 
public class NotShadingWorking {
    public static void main(String[] args) {
        var io = new Kattio(System.in, System.out);
 
        int t = io.nextInt();
        for (int i = 0; i < t; i++) {
            solve(io);
        }
 
        io.close();
    }
 
    public static void solve(Kattio io) {
        int n = io.nextInt();
        int m = io.nextInt();
        int r = io.nextInt();
        int c = io.nextInt();
 
        r-=1; c-=1;
 
        boolean [][]matrix = new boolean[n][m];
        boolean hasBlack = false;
 
        for (int j = 0; j < n; j++) {
            String line = io.next();
            for (int k = 0; k < m; k++) {
                matrix[j][k] = (line.charAt(k) == 'B');
                hasBlack |= matrix[j][k];
            }
        }
 
        if (!hasBlack) {
            io.println(-1);
        } else if (matrix[r][c]) {
            io.println(0);
        } else {
            boolean okay = false;
 
            for (int j = 0; j < n; j++) {
                okay |= matrix[j][c];
            }
 
            for (int k = 0; k < m; k++) {
            	okay |= matrix[r][k];
            }
 
            if (okay) {
                io.println(1);
            } else {
                io.println(2);
            }
        }
    }
}
 
// modified from https://github.com/Kattis/kattio/blob/master/Kattio.java
class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
        super(new BufferedOutputStream(System.out));
        r = new BufferedReader(new InputStreamReader(i));
    }
 
    public Kattio(InputStream i, OutputStream o) {
        super(new BufferedOutputStream(o));
        r = new BufferedReader(new InputStreamReader(i));
    }
 
    public boolean hasMoreTokens() {
        return peekToken() != null;
    }
 
    public int nextInt() {
        return Integer.parseInt(nextToken());
    }
    
    public double nextDouble() { 
        return Double.parseDouble(nextToken());
    }
 
    public long nextLong() {
        return Long.parseLong(nextToken());
    }
 
    public String next() {
        return nextToken();
    }
 
    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;
 
    private String peekToken() {
        if (token == null) 
            try {
            while (st == null || !st.hasMoreTokens()) {
                line = r.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            token = st.nextToken();
            } catch (IOException e) { }
        return token;
    }
 
    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }
}
