package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_2164 {

    public static void main(String[] args) throws IOException {

        Input();



    }
    static void Input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> queue = new LinkedList<Integer>();

        int N = Integer.parseInt(br.readLine());

        for(int i =  1; i < N+1; i++)  {

            queue.add(i);

        }

        while(queue.size() > 1) {
            queue.pollFirst();
            queue.addLast(queue.poll());
        }

        System.out.println(queue.poll());



    }

}



