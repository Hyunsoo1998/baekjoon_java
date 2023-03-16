package baekjoon_java;

import java.util.*;


public class baekjoon_2559 {

    static int[] temp ;
    static int N, K;
    static int Answer = Integer.MIN_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        temp = new int[N];

        for (int i = 0; i < N; i++) {
            temp[i] = sc.nextInt();
        }

        for (int i = 0; i <= N - K; i++) {
            int sum = 0;
            for (int j = i; j < i + K; j++) {
                sum += temp[j];
            }
            Answer = Math.max(Answer, sum);
        }

        System.out.println(Answer);
    }
}
