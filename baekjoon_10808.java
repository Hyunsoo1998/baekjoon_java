package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_10808 {

    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input()throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int[] count = new int[26];

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            count[(int) input.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < count.length; i++) {
            sb.append(count[i]);
            sb.append(" ");
        }

        System.out.println(sb);





    }
}
