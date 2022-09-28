package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_11382 {
    static BufferedReader br;
    static StringTokenizer st;

    static long a , b, c ;
    public static void main(String[] args) throws IOException{
        Input();
        Output();
    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        a=Long.parseLong(st.nextToken());
        b=Long.parseLong(st.nextToken());
        c=Long.parseLong(st.nextToken());

    }
     static void Output()throws IOException {
         System.out.println(a+b+c);
     }
}
