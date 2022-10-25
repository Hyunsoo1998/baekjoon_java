package baekjoon_java;


/*
      3 <= N <= 10,000
      1 <= local <= 100,000
      N <= budget <= 1,000,000,000
 */
import java.io.*;
import java.util.*;
public class boj_2512_CHJM_sol {
    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;
    static int[] arr;
    static int N, budget;
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }
    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];


        //4
        //120 110 140 150
        //485
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        budget = Integer.parseInt(br.readLine());
    }
    static void logic() {

        int L = 0, R = 0, ans = 0;
        for (int i = 0; i < N; i++) {
            // 정렬하지 않고 가장 큰 값을 뽑아낸다.
            R = Math.max(R, arr[i]);
        }

        //120 110 140 150
        while (L <= R) {
            int mid = (L + R) / 2;

            if (determination(mid)) {
                ans = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        sb.append(ans);
        System.out.println(ans);
    }
    static boolean determination(int limit) {

        int sum = 0;

        for (int i = 0; i < N; i++)
            sum += Math.min(limit, arr[i]);

        return sum <= budget; // 돈이 남는다.
    }
}