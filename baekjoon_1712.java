package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_1712 {
    static BufferedReader br;
    static StringTokenizer st;
    static int A, B ,C ;

    public static void main(String[] args) throws IOException{

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());


        if(C<=B) {
            System.out.println(-1);
        }else {
            System.out.println((A/(C-B))+1);
        }


    }
}
