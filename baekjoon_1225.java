package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_1225 {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        String input_first = st.nextToken();
        String input_second = st.nextToken();

        long sum = 0 ;

        for(int j = 0 ; j <input_second.length(); j++) {

            for(int i = 0 ; i < input_first.length() ; i++) {

                sum += (long)(input_second.charAt(j)-'0') * (long)(input_first.charAt(i)-'0');

            }

        }

        System.out.println(sum);


    }
}
