package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_11047 {
    static BufferedReader br;
    static StringTokenizer st;
    static int N , K ;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());


        ArrayList<Integer>list = new ArrayList<>();

        for(int i = 0 ; i < N ; i++) {
            int number = Integer.parseInt(br.readLine());


            if(number>K) {
                continue;
            }else {
                list.add(number);
            }
        }

        int count = 0 ;

        int coin = list.size();

        coin = coin -1;

        while(K!= 0) {

            if(list.get(coin)<= K) {

                K = K - list.get(coin);

                count ++ ;
            }else if(list.get(coin)>K) {
                coin --;
            }


        }

        System.out.println(count);


    }
}
