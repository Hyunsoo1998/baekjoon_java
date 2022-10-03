package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_2292 {
    static int N ;
    static BufferedReader br;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N= Integer.parseInt(br.readLine());


        int range = 2; // 범위(최솟값 기준)
        int count = 1; //겹 수  ( 최 소 루트 ) //최소 1개부터 시작하니까 .

        if(N == 1) {
            System.out.println(1);
        }
        else {
            while(range<=N) { //범위가 N보다 커지기 직전까지 반복. 1을제외하면 최소 범위는 2칸부터.

                range = range +(count*6); // 다음범위의 최솟값으로 초기화를 해줌.
                // 예를 들어서 2~7까지는 count ==2이고,
                //8부터는 3이니까. 초기화를 미리해주고. count값을 나중에 올려주면 다음 비교할때,
                //현재 계산에서도 문제없음..

                count++;
            }
            System.out.println(count);
        }



    }
}

