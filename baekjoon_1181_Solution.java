package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_1181_Solution {

    static StringBuilder sb = new StringBuilder();

    static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String lhs, String rhs) {
            if (lhs.length() != rhs.length())
                return lhs.length() - rhs.length();
            return lhs.compareTo(rhs);
        }
    }

    static int N;
    static String[] a;

    static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        N = Integer.parseInt(br.readLine());
        a = new String[N];
        for (int i = 0; i < N; i++) {
            st= new StringTokenizer(br.readLine());

            a[i] = st.nextToken();

        }
    }

    static void pro() {
        Arrays.sort(a, new MyComparator());
        for (int i = 0; i < N; i++) {
            if (i == 0 || a[i].compareTo(a[i - 1]) != 0)
                sb.append(a[i]).append('\n');
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException{
        input();
        pro();
    }


}
