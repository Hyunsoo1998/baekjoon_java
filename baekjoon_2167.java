package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_2167 {

    static BufferedReader br;
    static StringTokenizer st;

    static int N , M ;

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int client_input[][] = new int[N+1][M+1];

        for(int i = 1 ; i<=N ; i++) {

            st = new StringTokenizer(br.readLine());

            for(int j = 1; j<=M; j++) {
                client_input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int Test_case = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < Test_case; i++) {
            st = new StringTokenizer(br.readLine());
            int x_start = Integer.parseInt(st.nextToken());
            int y_start = Integer.parseInt(st.nextToken());

            int x_end = Integer.parseInt(st.nextToken());
            int y_end = Integer.parseInt(st.nextToken());

            sb.append(logic(client_input, x_start, y_start, x_end, y_end)).append('\n');
        }

        System.out.println(sb);



    }
    static int logic(int array[][], int x_start , int y_start , int x_end ,int y_end) throws IOException {

        int result = 0 ;
        for(int i = x_start ; i<=x_end; i ++) {

            for(int j = y_start ; j <=y_end; j++) {

                result+= array[i][j];

            }

        }

        return result;
    }
}
