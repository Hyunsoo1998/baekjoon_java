package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_10214 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input () throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int Test_case = Integer.parseInt(br.readLine());

        int yonsei_score = 0 ;
        int korea_score = 0 ;

        while(Test_case--> 0) {

            for(int i = 0 ; i <9 ; i++) {
                st = new StringTokenizer(br.readLine());
                int yonsei = Integer.parseInt(st.nextToken());
                int korea = Integer.parseInt(st.nextToken());

                yonsei_score += yonsei;
                korea_score += korea;

            }

            if(yonsei_score > korea_score) {
                sb.append("Yonsei").append('\n');
            }
            if(korea_score>yonsei_score) {
                sb.append("Korea").append('\n');

            }
            if(korea_score == yonsei_score) {
                sb.append("Draw").append('\n');
            }


        }
        System.out.println(sb);
    }
}
