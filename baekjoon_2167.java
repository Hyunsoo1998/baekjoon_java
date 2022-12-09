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


        //좌표 값을 1,1 부터 받기 위해서 크기를 입력받은 값에 +1로 설정.
        int client_input[][] = new int[N+1][M+1];

        for(int i = 1 ; i<=N ; i++) {

            st = new StringTokenizer(br.readLine());

            //2차원 배열에 값을 할당.
            for(int j = 1; j<=M; j++) {
                client_input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //Test_case는 누적합을 구하기 위해 좌표를 입력받기 위한 정수.
        int Test_case = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < Test_case; i++) {
            st = new StringTokenizer(br.readLine());
            int x_start = Integer.parseInt(st.nextToken());
            int y_start = Integer.parseInt(st.nextToken());

            int x_end = Integer.parseInt(st.nextToken());
            int y_end = Integer.parseInt(st.nextToken());


            //StringBuilder에 logic()함수의 return 값을 넣어준다.
            sb.append(logic(client_input, x_start, y_start, x_end, y_end)).append('\n');
        }

        System.out.println(sb);



    }


    //logic함수에서 누적합을 뽑아내고 그 값을 return해준다.
    static int logic(int array[][], int x_start , int y_start , int x_end ,int y_end) throws IOException {

        //result변수를 지역변수로 선언 했기 때문에 함수를 호출할때 생성 되고,
        //함수가 종료되면 result변수가 사라지기 때문에 호출시마다 초기화를 시켜 기존에 return된 값에 영향을 주지 않는다.
        int result = 0 ;
        for(int i = x_start ; i<=x_end; i ++) {

            for(int j = y_start ; j <=y_end; j++) {

                result+= array[i][j];

            }

        }

        return result;
    }
}
