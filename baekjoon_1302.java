package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_1302 {

    static BufferedReader br;
    static Map<String, Integer> map = new TreeMap<>();
    static int N;

    public static void main(String[] args) throws IOException {

        Input();
        logic();

    }

    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());


        //TreeMap을 사용하면 자동 정렬 된다 .

        for (int i = 0; i < N; i++) {
            String client_input = br.readLine();

            if (map.containsKey(client_input)) {
                map.put(client_input, map.get(client_input) + 1);

            } else {
                map.put(client_input, 1);
            }

        }
    }

    static void logic() throws IOException {

        //map을 value 기준으로 정렬하기 위하여 List로 변형

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());

        entryList.sort((o1, o2) -> o2.getValue() - o1.getValue());

        //리스트 내부에 entryList가 들어있기 때문에 entryList.get(index).getkey()로 key값에 접근함.
        System.out.println(entryList.get(0).getKey());


    }
}

