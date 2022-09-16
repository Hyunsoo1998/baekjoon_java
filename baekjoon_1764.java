package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_1764 {
//    ohhenrie
//            charlie
//    baesangwook
//            obama
//    baesangwook
//            ohhenrie
//    clinton

        public static void main(String[] args)  throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st= new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());

            ArrayList<String> list_d = new ArrayList<String>();
            ArrayList<String> list_b = new ArrayList<String>();
            ArrayList<String> list_same = new ArrayList<String>();

            for(int i =0; i < N; i++) {

                list_d.add(st.nextToken());
            }
            Collections.sort(list_d);

            for(int i = 0; i< M; i++) {

                list_b.add(st.nextToken());

            }
            Collections.sort(list_b);

            int count = 0 ;
            for(int i=0 ; i< N ; i++) {
                for(int j = 0 ; j<M ; j++) {
                    if(list_d.get(i)==list_b.get(j)) {
                        list_same.add(list_d.get(i));
                        count++;
                    }
                }
            }


            System.out.println(count);
            System.out.println(list_same);




        }
}
