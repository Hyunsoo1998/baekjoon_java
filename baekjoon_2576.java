package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_2576 {
    static BufferedReader br;
    static int  T , number;
    static StringBuilder sb;
    static PriorityQueue<Integer>pq;

    public static void main(String[] args) throws IOException{

        Input();

        logic();
    }
    static void Input() throws IOException {

        sb = new StringBuilder();

        br = new BufferedReader(new InputStreamReader(System.in));

        T = 7;


    }
    static void logic() throws IOException {

        pq = new PriorityQueue<>();

        int sum =0;

        while(T--> 0) {
            number = Integer.parseInt(br.readLine());
            if(number%2!=0) {

                pq.add(number);
                sum+=number;
            }
        }
        if(pq.isEmpty()) {

            sb.append(-1);
        }else {
            sb.append(sum).append('\n');
            sb.append(pq.peek());
        }
        System.out.println(sb);
    }
}
