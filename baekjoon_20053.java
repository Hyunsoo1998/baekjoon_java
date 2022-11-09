package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_20053 {
    static BufferedReader br;
    static StringTokenizer st ;
    static StringBuilder sb;

    static int Test_case;
    static int Number_count;


    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        Test_case = Integer.parseInt(br.readLine());


            while(Test_case -->0 ) {

                ArrayList<Integer>list = new ArrayList<>();

                Number_count = Integer.parseInt(br.readLine());

                st = new StringTokenizer(br.readLine());
                for(int i = 0 ; i < Number_count ; i ++) {
                    int count = Integer.parseInt(st.nextToken());
                    list.add(count);
                }
                Find(list);

            }
            System.out.println(sb);

    }
    static void Find (ArrayList<Integer>Client_list) {
            Collections.sort(Client_list);

            sb.append(Client_list.get(0)).append(' ').append(Client_list.get(Client_list.size()-1));
            sb.append('\n');


    }
}
