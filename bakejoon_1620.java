package baekjoon_java;

import java.util.*;
import java.io.*;

public class bakejoon_1620 {
    static BufferedReader br;
    static StringTokenizer st;
    static int N, M;
    static String name, arr[];
    static StringBuilder sb;
    static HashMap<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        Input();
        Output();
    }

    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new String[N + 1];

        for (int i = 1; i < N+1; i++) { //N개를 입력 받기 .
            //N개를 입력받을때 for문에서 i = 0 ; i < N ; 이 아닌 . 
            //i = 1; i< N+1로 받은 이유 .
            
            name = br.readLine();
            map.put(name, i);
            arr[i] = name;
        }


    }

    static void Output() throws IOException {
        sb = new StringBuilder();
        while (M-- > 0) {
            String findname = br.readLine();

            if (Find(findname)) {  //숫자를 입력 받은 경우.
                int index = Integer.parseInt(findname);
                sb.append(arr[index]).append('\n');
            } else { // 문자를 입력 받은 경우 .
                sb.append(map.get(findname)).append('\n');
            }

        }
        System.out.println(sb);


    }

    static boolean Find(String name) throws IOException {// try catch문을 이용해서 정수형으로 변환 가능하면 true를
        //return 하기 때문에 조건문에서 함수 호출시 (boolean타입 이기 때문에) 사용 가능.
        try {
            Double.parseDouble(name);
            return true;
        } catch (NumberFormatException e) {

            return false;
        }
    }
}
