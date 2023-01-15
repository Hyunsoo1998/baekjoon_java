package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_1158 {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N , K ;

    public static void main(String[] args) throws IOException {

        Input();
        Output();

    }
    static void Input() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Queue<Integer>queue =  new LinkedList<>();


        sb.append('<');

        for(int i = 1 ; i <= N ; i++) {
            queue.offer(i);
        }

        while(queue.size()!= 1) {


            for(int i = 0 ; i < K-1 ; i ++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");

        }
        sb.append(queue.poll());

        sb.append('>');



    }
    static void Output() throws IOException {
        System.out.println(sb);

    }
}
