package baekjoon_java;


import java.util.*;
import java.io.*;


public class baekjoon_9085 {


    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();




    public static void main(String[] args) throws IOException{

        Input();
        System.out.println(sb);

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int Test_case =Integer.parseInt(br.readLine());

        while(Test_case -->0) {

           sb.append(logic()).append('\n') ;

        }


    }
    static int logic() throws IOException {

        ArrayList<Integer>Client_input_save = new ArrayList<>();

        int result = 0 ;
        int Client_input_size = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < Client_input_size; i ++) {
            Client_input_save.add(Integer.parseInt(st.nextToken()));
            result += Client_input_save.get(i);
        }

        return result;

    }
}
