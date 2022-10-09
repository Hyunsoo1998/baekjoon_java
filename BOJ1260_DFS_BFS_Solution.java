package baekjoon_java;

import java.io.*;
import java.util.*;
public class BOJ1260_DFS_BFS_Solution {
    static int N, M, start;
    static boolean[] visit;
    static ArrayList<Integer>[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        visit = new boolean[N + 1];
        arr = new ArrayList[N + 1];
        // 1번 V 부터 생성시작
        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }
        // input
        for (int i = 1; i <= M; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int dx = Integer.parseInt(st1.nextToken());
            int dy = Integer.parseInt(st1.nextToken());
            arr[dx].add(dy);
            arr[dy].add(dx);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(arr[i]);
        }
        dfs(start);
        sb.append('\n');
        for (int i = 1; i <= N; i++) {
            visit[i] = false;
        }
        bfs(start);
        System.out.println(sb);
    }

    static void dfs(int start) {
        visit[start] = true;
        sb.append(start).append(' ');
        for (int y : arr[start]) {
            if (visit[y]) continue;
            dfs(y);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visit[start] = true;
        while (!queue.isEmpty()) {
            int k = queue.poll();
            sb.append(k).append(' ');
            for (int y : arr[k]) {
                if (visit[y]) continue;
                queue.add(y);
                visit[y] = true;
            }
        }
    }
}
