package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_7785 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());

        HashMap<String,String> map = new HashMap<>();


        while(input --> 0) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();


            if(map.containsKey(name)) {
                map.remove(name);
            }else if(!map.containsKey(name)) {
                map.put(name,status);
            }


        }

        ArrayList<String> list = new ArrayList<String>(map.keySet());

        Collections.sort(list,Collections.reverseOrder());


        for(int i = 0 ; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }




    }
}
