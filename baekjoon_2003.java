package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_2003 {

    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int Client_input []  = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i ++) {
            Client_input[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(twoPointer(Client_input , M));



    }
    static int twoPointer(int [] arr , int m ) {

        int count = 0  , startpoint = 0 , endpoint = 0 ;
        int len = arr.length;
        int sum = 0;

        while(true) {

            if(sum >= m) {
                // M 보다 sum이 크면 값을 줄여서 M을 맞춰야 하므로 현재 startIndex의 값을 빼고 한 칸 앞으로 이동해야 한다.
                sum -= arr[startpoint++];
            }
            else if(endpoint >= len) {
                break;
            }
            else {
                // M 보다 sum이 작으면 값을 늘려서 M을 맞춰야 하므로 현재 endIndex를 한 칸 앞으로 이동시키고 그인덱스의 원소 값을 더해줘야 한다.
                sum += arr[endpoint++];
            }

            if(sum == m) {
                count ++ ;
            }

        }
        return count ;

    }
}
