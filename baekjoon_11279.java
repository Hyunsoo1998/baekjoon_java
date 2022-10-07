package baekjoon_java;

import java.util.*;
import java.io.*;

/*첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다.
만약 x가 자연수라면 배열
에 x라는 값을 넣는(추가하는) 연산이고, x가 0이라면 배열에서 가장 큰 값을 출력하고 그 값을 배열에서 제거하는 경우이다.
입력되는 자연수는 231보다 작다.
* */
public class baekjoon_11279 {
    static BufferedReader br;
    static int N  ;
    static StringBuilder sb;


    static PriorityQueue<Integer>pq ;

    public static void main(String[] args) throws IOException{

        Input();
        Output();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i = 0 ;  i< N ; i ++ ) {
            int input = Integer.parseInt(br.readLine());

            if(input == 0 ) {

                if(pq.isEmpty()) { //큐가 비어있다면 0을 StringBuilder에 넣어준다.

                    sb.append(0).append('\n');
                }else {
                    //큐가 비어있지 않다면 값을 가져오고 삭제함. StringBuilder에 가져온 값을 넣어줌 .
                    sb.append(pq.poll()).append('\n');
                }

            }else {
                pq.offer(input);

            }
        }
    }
    static void Output() throws IOException {
        System.out.println(sb);
    }
}
