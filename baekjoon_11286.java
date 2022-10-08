package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_11286 {
    static StringBuilder sb;
    static BufferedReader br;
    static int N;

    public static void main(String[] args) throws IOException {
        Input();
    }

    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> p_queue = new PriorityQueue<>((o1, o2) -> {

            //절대값 기준으로 앞자리가 더 크다면 자리를 바꿔준다 .
            if (Math.abs(o1) > Math.abs(o2)) {
                return Math.abs(o1) - Math.abs(o2); // 오름차순
            } else if (Math.abs(o1) == Math.abs(o2)) { // 같으면 내림차순
                return o1 - o2;
            } else {
                return -1; // 초과면 - 1
            }
        });

        sb = new StringBuilder();

        for (int i = 0; i < N; i++) {

            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (p_queue.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(p_queue.poll()).append('\n');
                }
            } else {
                p_queue.offer(x);
            }
        }
        System.out.println(sb);
    }
}
