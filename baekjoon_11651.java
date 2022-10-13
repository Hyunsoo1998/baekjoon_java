package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_11651 {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    static int N;
    static int arr[][];


    public static void main(String[] args) throws IOException {


        Input();

    }

    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int [N][2];

        for(int i = 0; i < N ; i ++) {
            st = new StringTokenizer(br.readLine());

            //x 값이 먼저 들어오고 , Y를 기준으로 정렬을 해줘야 하기 때문에 입력만 x를 먼저받고 넣는거는 x를 두번째 인덱스에 넣는다 .
            arr[i][1]=Integer.parseInt(st.nextToken());
            arr[i][0]=Integer.parseInt(st.nextToken());

        }

        Arrays.sort(arr,(o1, o2) -> {

            if(o1[0]==o2[0]) {

                return o1[1]-o2[1];
            }else {

                return o1[0]-o2[0];
            }
        });


        for(int i = 0 ; i < N ; i++) {
            sb.append(arr[i][1] + " "+arr[i][0]).append('\n');
        }
        System.out.println(sb);
    }
}

