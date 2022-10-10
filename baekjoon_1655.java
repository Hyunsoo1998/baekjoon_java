package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_1655 {
    static int N;
    static BufferedReader br;
    static StringBuilder sb;


    public static void main(String[] args) throws IOException {

        Input();

    }

    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        sb = new StringBuilder();

        PriorityQueue<Integer> p_queue_min = new PriorityQueue<>();
        PriorityQueue<Integer> p_queue_max = new PriorityQueue<>((o1, o2) -> o2 -o1);


        for (int i = 0 ; i <  N ; i ++) {
            if (i % 2 == 0) {
                p_queue_max.offer(Integer.parseInt(br.readLine()));
            }
            else {
                p_queue_min.offer(Integer.parseInt(br.readLine()));
            }

            // maxheap의 최대값이 minheap의 최소값보다 크면 swap
            if(!p_queue_max.isEmpty() && !p_queue_min.isEmpty()) {

                if(p_queue_max.peek()>p_queue_min.peek()) {

                    int temp = p_queue_max.poll();

                    p_queue_max.offer(p_queue_min.poll());
                    p_queue_min.offer(temp);
                }
            }
            sb.append(p_queue_max.peek()).append('\n');
        }
        System.out.println(sb);

    }

}