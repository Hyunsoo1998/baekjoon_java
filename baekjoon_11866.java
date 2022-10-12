package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_11866 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;


    static int N, K ;

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Queue<Integer>queue = new LinkedList<>();

        for(int i = 1; i <= N; i ++) {

            queue.offer(i);

        }
        sb.append("<");

        while(queue.size()>1) {

            for(int i = 0 ; i < K-1; i++ ) {
                int temp = queue.poll();

                queue.offer(temp);


            }
            sb.append(queue.poll()).append(", ");

        }
        sb.append(queue.poll()).append(">");


        System.out.println(sb);

    }
}
