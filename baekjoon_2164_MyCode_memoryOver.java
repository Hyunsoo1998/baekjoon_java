package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_2164_MyCode_memoryOver {



    public static void main(String[] args) throws IOException{

        Input();



    }
    static void Input() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer>queue = new LinkedList<Integer>();

        int N = Integer.parseInt(br.readLine());

        for(int i =  1; i < N+1; i++)  {

            queue.add(i);

        }
        while(true) {
            queue.pollFirst();
            queue.addLast(queue.peekFirst());
            queue.removeFirst();



            if(queue.size()==1) {

               sb.append(queue.peek());
                System.out.println(sb);
                break;
            }
        }


    }

}
