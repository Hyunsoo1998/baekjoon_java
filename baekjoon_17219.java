package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_17219 {
    static BufferedReader br;
    static StringTokenizer st;
    static ArrayList<String>list;
    static StringBuilder sb;

    static int N ,  M ;

    static HashMap<String ,String > map;
    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        list = new ArrayList<>();
        map = new HashMap<>();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < N ; i ++) {
            st = new StringTokenizer(br.readLine());
            String input_site = st.nextToken();
            String input_password =st.nextToken();

            map.put(input_site , input_password);
        }

        for(int i = 0 ; i < M ; i ++) {
            String find = br.readLine();
            list.add(find);

        }

        for(int i = 0 ; i < list.size() ; i ++) {
            if(map.containsKey(list.get(i))) {
                sb.append(map.get(list.get(i))).append('\n');
            }
        }

        System.out.println(sb);
    }
}
