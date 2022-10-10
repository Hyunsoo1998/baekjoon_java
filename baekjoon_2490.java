package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_2490 {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

         br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            int sum = 0;
             st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }

            if (sum == 3) {
                System.out.println("A");
            } else if (sum == 2) {
                System.out.println("B");
            } else if (sum == 1) {
                System.out.println("C");
            } else if (sum == 0) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }
    }
}

