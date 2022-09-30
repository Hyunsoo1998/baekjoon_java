package baekjoon_java;


import java.io.*;
import java.util.*;

public class boj_2805_parmetricSearch {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }
    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
    }
    static void logic() {
        long L = 0;
        long R = 2000000000;
        long ans = 0;
        while (L <= R) {
            long mid = (L + R) / 2;
            if (determination(mid)) {
                ans = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        sb.append(ans);
        System.out.println(sb);
    }
    static boolean determination(long h) {
        long ans = 0;
        for (int i = 0; i < N; i++) {
            int tree = arr[i];
            if (tree > h) {
                ans += tree - h;
            }
        }
        return ans >= M;
        // true 리턴
        // 정답 조건이 시작되는 곳
    }
}
