package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_2902 {

    static BufferedReader br;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        String enter = br.readLine();

        String Client_input[] = enter.split("-");

        logic(Client_input);

    }
    static void logic(String Client_input[]) throws IOException {

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < Client_input.length; i ++) {
            sb.append(Client_input[i].charAt(0));
        }

        System.out.println(sb);

    }
}
