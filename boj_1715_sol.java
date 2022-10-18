package baekjoon_java;

import java.util.*;
import java.io.*;
/*
*  우선순위 큐를 사용해서 큐에 값을 넣어주면 알아서 정렬이 되어서 들어가기 때문에 배열을 만들고 Arrays.sort를 쓸 필요가 없음.
*  또한 여러개의 배열을 만들 필요도 없고, 코드 구현도 훨씬 깔끔해짐.
*
* 내가 작성한코드는 예제의 값은 잘 나오지만 , 실패.
* 그 이유는 카드가 1묶음일때 다른 카드와 비교를 할 필요가 없으므로
* 연산횟수가 0이 나와야 하는데
* 예외 케이스를 고려하지 않음.
*
* 반례 예시도 맞지않음. 예제 입력에 초점을 두고 풀어서 예제 입력은 맞지만
* 다른 예시, 케이스를 고려 못함.
*
*
*
* */

public class boj_1715_sol {
    static BufferedReader br;
    static int N ;
    static PriorityQueue<Integer>pq = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        while(N--> 0) {
            int input = Integer.parseInt(br.readLine());

            pq.add(input);

        }

        int result = 0 ;
        while(pq.size()>1) {

            int a = pq.poll();
            int b= pq.poll();

            result += (a+b);

            pq.add(a+b);

        }

        System.out.println(result);


    }
}
