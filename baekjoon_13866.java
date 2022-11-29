package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_13866 {
    static BufferedReader br;
    static StringTokenizer st;

    static ArrayList<Integer>list ;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        list = new ArrayList<>();
        for(int i = 0 ; i < 4; i ++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        int result1  = list.get(0) + list.get(list.size()-1);

        int result2 = list.get(1) + list.get(list.size()-2);

        System.out.println(Math.abs(result1-result2));



    }
}
