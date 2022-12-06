package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_11004 {

    static BufferedReader br;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int Client_input_size = Integer.parseInt(st.nextToken());
        int Client_input_find = Integer.parseInt(st.nextToken());

        ArrayList<Integer>Client_input_list = new ArrayList<>();


        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < Client_input_size; i ++) {
            Client_input_list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(Client_input_list);

        System.out.println(Client_input_list.get(Client_input_find-1));

    }
}
