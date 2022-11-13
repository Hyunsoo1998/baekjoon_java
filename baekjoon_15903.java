package baekjoon_java;

import java.util.*;
import java.io.*;



public class baekjoon_15903 {
    static BufferedReader br;
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException {

        Input();

    }

    static void Input () throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());

            ArrayList<Long>list = new ArrayList<>();

            int card_count = Integer.parseInt(st.nextToken());
            int sum_count = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < card_count ; i ++) {
                list.add(Long.parseLong(st.nextToken()));
            }

            logic(sum_count , list );


    }
    static void logic( int sum_count , ArrayList<Long>result_list) throws IOException {

            long sum = 0 ;

            while(sum_count --> 0) {
                long temp = 0 ;
                Collections.sort(result_list);
                temp= result_list.get(0) + result_list.get(1);

                result_list.remove(0);
                result_list.remove(0);

                result_list.add(0,temp);
                result_list.add(1,temp);

            }
            for(int i = 0 ; i <result_list.size() ; i ++) {
                sum += result_list.get(i);
            }
            System.out.println(sum);

    }

}
