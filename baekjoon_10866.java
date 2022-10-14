package baekjoon_java;

import java.io.*;
import java.util.*;


public class baekjoon_10866 {
    static BufferedReader br;
    static StringTokenizer st ;
    static Deque<Integer>deque;
    static StringBuilder sb;

    static int N ;

    public static void main(String[] args) throws IOException{

        Input();
        System.out.println(sb);

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        deque = new LinkedList<> ();

        while(N --> 0) {
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
                case "push_front" :
                deque.addFirst(Integer.parseInt(st.nextToken()));

                break;

                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));

                    break;

                case "pop_front" :
                    if (deque.isEmpty()) {

                        sb.append(-1).append('\n');
                    }else {
                        sb.append(deque.pollFirst()).append('\n');
                    }
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {

                        sb.append(-1).append('\n');
                    }else {
                        sb.append(deque.pollLast()).append('\n');
                    }
                     break;

                case "size":
                    sb.append(deque.size()).append('\n');

                    break;

                case "empty":
                    if(deque.isEmpty()) {
                        sb.append(1).append('\n');
                    }else {
                        sb.append(0).append('\n');
                    }

                    break;

                case "front" :
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(deque.peekFirst()).append('\n');
                    }

                    break;
                case "back" :
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(deque.peekLast()).append('\n');
                    }
                    break;
            }
        }

    }
}
