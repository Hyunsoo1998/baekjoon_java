package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_19944 {
    static BufferedReader br;
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        if(M<=N && M<=2) {
            System.out.println("NEWBIE!");
        }else if(M<=N && M>2) {
            System.out.println("OLDBIE!");
        }else {
            System.out.println("TLE!");
        }

    }
}
