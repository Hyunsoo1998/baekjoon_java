package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_10828 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N;
    static int arr[];
    static int size = 0 ;
    public static void main(String[] args) throws IOException{
        Input();
        Output();

    }
  static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int [N];

        while(N-->0) {
           st = new StringTokenizer(br.readLine()," ");

           switch(st.nextToken()) {

               case "push":
                   push(Integer.parseInt(st.nextToken()));
                   break;

               case "pop" :
                   sb.append(pop()).append('\n');
                    break;

               case "size" :
                   sb.append(size()).append('\n');
                    break;
               case "top" :
                   sb.append(top()).append('\n');
                   break;

               case "empty":
                   sb.append(empty()).append('\n');
                    break;
           }

        }


    }
    static void Output()throws IOException {
        System.out.println(sb);
    }
    static void push(int item) {
        arr[size]=item;

        size ++;

    }
    static int pop() {

        if(size == 0) {

            return -1;
        }else {
            int pop_number = arr[size-1];
            arr[size-1]=0;
            size --;
            return pop_number;

        }
    }
    static int size() {

        return size;
    }
    static int top() {
        if(size == 0) {
            return -1;
        }else {
            return arr[size-1];
        }
    }
    static int empty() {
        if(size == 0) {
            return 1;
        }else {
            return 0;
        }
    }


}
