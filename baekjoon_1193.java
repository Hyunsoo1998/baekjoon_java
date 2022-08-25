package baekjoon_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
입력받을 X 값
해당 범위의 대각선 칸 개수 ( cross_count )
해당 대각선 직전 대각선 까지의 칸의 누적 합 ( prev_count_sum )


* */
public class baekjoon_1193 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());

        int cross_count = 1 ;
        int prev_count_sum = 0;

        while(true) {
            if (X <= prev_count_sum + cross_count) {

                if (cross_count % 2 == 1) { //대각선의 개수가 홀수라면
                    //분자가 큰 수 부터 시작

                    // 분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1)
                    // 분모는 X 번째 - 직전 대각선까지의 블럭 개수

                    System.out.println((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;

                }
                else{ //대각선상의 블록의 개수가 짝수라면
                    //홀수와 반대로 출력
                    System.out.println((X-prev_count_sum)+"/"+(cross_count - (X-prev_count_sum -1)));
                    break;
                }

            }else{
                prev_count_sum +=cross_count;
                cross_count++;

            }

        }
    }
}
