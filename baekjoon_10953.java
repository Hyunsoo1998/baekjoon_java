package baekjoon_java;

import java.io.*;
import java.util.*;

public class baekjoon_10953 {
    static int A , B;
    static StringTokenizer st;
    static BufferedReader br;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T--> 0) {
            st = new StringTokenizer(br.readLine(), ",");

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            System.out.println(A+B);
        }

    }
}
