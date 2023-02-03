package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_4458 {
    static BufferedReader br;
    static StringBuilder sb;


    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int Test_case =Integer.parseInt(br.readLine());

        while(Test_case -->0 ) {
            ArrayList<Character>list = new ArrayList<>();

            String Client_input =br.readLine();

            for(int i = 0 ; i < Client_input.length(); i++) {
                list.add(Client_input.charAt(i));
            }
            logic(list);

        }

    }
    static void logic(ArrayList<Character>logic_list ) throws IOException {

        sb = new StringBuilder();

        if((int)logic_list.get(0)>=97 && (int)logic_list.get(0)<=122 ) {
            logic_list.set(0, ((char)((int)logic_list.get(0)-32)));
        }
        for(int i = 0 ; i < logic_list.size(); i ++) {
            sb.append(logic_list.get(i));
        }

        System.out.println(sb);

        reset(logic_list);


    }
    static void reset(ArrayList<Character>list_reset) throws IOException {

        list_reset.clear();

    }
}
