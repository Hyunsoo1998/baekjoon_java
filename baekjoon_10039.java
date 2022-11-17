package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_10039 {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0 ;
        int count = 5;
        while(count-->0) {

            int score = Integer.parseInt(br.readLine());

            if(score < 40) {
                score = 40;

            }
            sum+= score;

        }
        System.out.println(sum/5);
    }
}
