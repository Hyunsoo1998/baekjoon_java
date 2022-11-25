package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_5596 {
    static BufferedReader br;
    static StringTokenizer st;
    static ArrayList<Integer>mk_list;
    static ArrayList<Integer>ms_list;
    static ArrayList<Integer>result ;

    public static void main(String[] args) throws IOException {

        Input();
        logic();

    }
    static void Input() throws IOException {

        mk_list = new ArrayList<>();
        ms_list = new ArrayList<>();


        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i <4; i++) {
            mk_list.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i <4 ; i++) {
            ms_list.add(Integer.parseInt(st.nextToken()));
        }

    }
    static void logic() throws IOException {
            int mk_sum = 0 ;
            int ms_sum = 0 ;

            result = new ArrayList<>();


            for(int i = 0 ; i <4; i++) {

            mk_sum += mk_list.get(i);
            ms_sum += ms_list.get(i);

            }

            if(mk_sum >= ms_sum ) {
                System.out.println(mk_sum);
            }else {
                System.out.println(ms_sum);
            }



    }
}
