package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_1748 {

    static BufferedReader br;
    static int N ;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int count =  0 , num = 10 , plus = 1;

        for(int i =  1 ; i <= N ; i ++) {

            // 자릿수 바뀌는 조건 => 10, 100, 1000, 10000, ..
            if(i%num == 0) {
                plus++ ;
                num = num*10;

            }
            count+=plus;
        }
        System.out.println(count);


    }
}
