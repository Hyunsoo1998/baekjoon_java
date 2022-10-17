package baekjoon_java;

import java.util.*;
import java.io.*;



public class baekjoon_10845 {

    static StringBuilder sb;


    static int N ;
    static StringTokenizer st;
    static BufferedReader br;

    static Deque<Integer>queue= new LinkedList<>();


    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {


        sb= new StringBuilder();

        br = new BufferedReader(new InputStreamReader(System.in));


        N = Integer.parseInt(br.readLine());


        for(int i = 0 ; i<N ; i ++) {

            st=  new StringTokenizer(br.readLine());

            switch(st.nextToken()) {

                case"push":
                    queue.offerLast(Integer.parseInt(st.nextToken()));

                    break;

                case "pop":
                    if(queue.isEmpty()) {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(queue.pollFirst()).append('\n');
                    }
                    break;

                case "size":
                    sb.append(queue.size()).append('\n');

                    break;


                case "empty":

                    if(queue.isEmpty()) {
                        sb.append(1).append('\n');
                    }else {
                        sb.append(0).append('\n');
                    }

                    break;

                case "front" :
                    if(queue.isEmpty()) {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(queue.peekFirst()).append('\n');
                    }
                    break;

                case "back" :

                    if(queue.isEmpty()) {
                        sb.append(-1).append('\n');
                    }else {

                        sb.append(queue.peekLast()).append('\n');


                    }

                    break;

            }
        }

        System.out.println(sb);





    }

}
