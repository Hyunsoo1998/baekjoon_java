package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_2738 {
    static BufferedReader br;
    static StringTokenizer st ;

    static StringBuilder sb;

    static int N , M ;

    public static void main(String[] args ) throws IOException{

        Input();

    }
    static void Input() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int matrix_A [][] = new int[N][M];
        int matrix_B [][] = new int[N][M];

        int matrix_sum_result [][] = new int[N][M];


            for(int i = 0 ; i < N; i ++) {


                // 3 3 3
                // 1 1 1
                // 2 2 2
                // 0 1 0


                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    matrix_A[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i = 0 ; i<N; i++) {
                st = new StringTokenizer(br.readLine());

                for(int j = 0 ; j<M ; j ++) {
                    matrix_B[i][j] = Integer.parseInt(st.nextToken());

                    matrix_sum_result[i][j] = matrix_B[i][j] + matrix_A[i][j];

                    sb.append(matrix_sum_result[i][j]).append(' ');

                }
                sb.append('\n');
            }
                System.out.println(sb);
    }
}
