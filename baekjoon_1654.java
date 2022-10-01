package baekjoon_java;

import java.io.*;
import java.util.*;

public class baekjoon_1654 {
    static int N, K ;
    static BufferedReader br;
    static StringTokenizer st;

    static int arr[];
    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br= new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        K=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());


        arr = new int[K];


        long Min =0;
        long Max = 0;


        for(int i =0; i < K; i++) {
            arr[i]=Integer.parseInt(br.readLine());

            if(Max<arr[i]) {
                Max=arr[i];
            }
        }
       //배열을 정렬 할 필요도없음 Upperbound값만 변수에 넣어주고 비교하면 된다 .
        /*802 , 743 , 457 , 539*/
        //4     3     2     2   = 11
        //200


        //반드시 max값에 +1을 해줘야함.
        //아주 만약에 {1,1}이 입력되면 L = 0 R= 1 이므로 mid = 0 이므로 이진탐색 수행불가.

        Max++;
        while(Min<Max) {

            long count = 0 ;
            long mid = (Min+Max)/2;
            for(int i = 0 ; i < arr.length; i++) {
                count += (arr[i])/mid;
            }
            if(count <N) {
                Max=mid;
            }else {
                Min=mid+1;
            }
        }
        //우리는 Upperbound값(최대값을 출력하는 정수의 길이를 찾는것. 그래서 Upperbound로 찾은 정수 -1을 해줘야 나옴. )

        System.out.println(Min-1);
    }

}
