package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_15964 {
    static BufferedReader br;
    static StringTokenizer st ;

    static long A , B;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        A= Long.parseLong(st.nextToken());
        B= Long.parseLong(st.nextToken());
        long result = (A+B)*(A-B);

        System.out.println(result);

    }
}
