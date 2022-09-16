package baekjoon_java;

import java.io.*;
import java.util.*;
public class baekjoon_1764_Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<String> set = new HashSet<>(); // 듣도 못한 사람 저장할 set.
        ArrayList<String> list = new ArrayList<String>() ; //보도 못한 사람 저장할 list

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i<N ; i++) {
            set.add(br.readLine());

        }
        int count =0; //듣도 보도 못한 사람의 수를 저장할 변수 선언.
        
        for(int j = 0 ; j<M ; j++) {
            String tmp = br.readLine();
            if(set.contains(tmp)) {

                list.add(tmp);
                count++;
            }
        }
        Collections.sort(list);
        System.out.println(count);

        for(int i = 0 ; i<list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
