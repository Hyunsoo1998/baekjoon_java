package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_1476 {
    static BufferedReader br;
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int count = 1 ;

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int E_count = 1 , S_count = 1 , M_count = 1;

        //. (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
        while(E!= E_count || S != S_count ||  M != M_count) {

            E_count ++; S_count++ ; M_count ++ ; count++;

            if(E_count == 16) {
                E_count = 1 ;
            }
            if(S_count == 29) {
                S_count = 1;
            }
            if(M_count == 20) {
                M_count = 1 ;
            }

        }
        System.out.println(count);

    }
}
