package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_1927 {
    static int N  ;
    static BufferedReader br;


    public static void main(String[] args) throws IOException{
        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer>p_queue = new PriorityQueue<Integer>() ;

        for(int i = 0 ; i < N ; i++) {

            int number = Integer.parseInt(br.readLine());

            if(number == 0) {
                if(p_queue.isEmpty()) {
                    sb.append(0).append('\n');
                }else {
                    sb.append(p_queue.poll()).append('\n');
                }
            }else {
                p_queue.offer(number);
            }
        }
        System.out.println(sb);
    }
}
