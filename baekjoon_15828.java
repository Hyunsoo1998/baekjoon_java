package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_15828 {
    static BufferedReader br;
    static int buffer_size;

    static Queue<Integer> queue;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        Input();
        System.out.println(sb);

    }

    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        buffer_size = Integer.parseInt(br.readLine());

        queue = new LinkedList<>();


        while (true) {
            int input = Integer.parseInt(br.readLine());

            if (input == -1) {

                if (queue.isEmpty()) {
                    sb.append("empty");

                    break;
                }
                while (!queue.isEmpty()) {
                    sb.append(queue.poll()).append(' ');

                }
                break;

            } else if (queue.size() < buffer_size && input != 0 && input != -1) {

                queue.offer(input);

            } else if (queue.size() >= buffer_size && input != 0 && input != -1) {
                continue;
            }
            else if (!queue.isEmpty() && input == 0) {
                queue.poll();
            }


        }
    }
}
