package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_2776 {

    static BufferedReader br;
    static StringTokenizer st;

    static TreeMap<Integer,Integer> Note1;
    static StringBuilder sb = new StringBuilder();
    static int Note2[];

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));


        int Test_case = Integer.parseInt(br.readLine());



       while(Test_case --> 0) {

           int first_input_size = Integer.parseInt(br.readLine());

           Note1 = new TreeMap<>();

           st = new StringTokenizer(br.readLine());

           for(int i = 0 ; i < first_input_size; i ++) {
               int Note1_input = Integer.parseInt(st.nextToken());

               Note1.put(Note1_input,i);
           }

           int second_input_size = Integer.parseInt(br.readLine());

           Note2 = new int[second_input_size];

           st = new StringTokenizer(br.readLine());

           for(int i = 0 ; i  < second_input_size; i ++) {
               Note2[i] = Integer.parseInt(st.nextToken());
           }

           for(int i = 0 ; i <second_input_size; i ++) {
               if(Note1.containsKey(Note2[i])) {
                  sb.append('1').append('\n');
               }else {
                   sb.append('0').append('\n');
               }
           }
       }
        System.out.println(sb);
    }

}
