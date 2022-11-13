package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_2161 {
    static BufferedReader br;
    static Queue<Integer>queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException  {
        br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        for(int i = 1 ; i <=input ; i ++) {

            queue.offer(i);

        }

        while(queue.size()!=1) {

            sb.append(queue.remove()).append(' ');
            queue.add(queue.peek());
            queue.remove();

        }
        sb.append(queue.remove());

        System.out.println(sb);


    }
}
