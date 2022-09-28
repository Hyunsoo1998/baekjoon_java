package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_20492 {

    static int N ,case1,case2 ;
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException{
        Input();
        Output();

    }
    static void Input()throws IOException  {
        br = new BufferedReader(new InputStreamReader(System.in));

        N= Integer.parseInt(br.readLine());
    }
    static void Output()throws IOException  {

        sb = new StringBuilder();
        int mid;
        //전체 상금의 22%를 제세공과금으로 납부하는 경우
        case1= N-(int)(N*0.22);
        //상금의 80%를 필요 경비로 인정받고, 나머지 금액 중 22%만을 제세공과금으로 납부하는 경우
        mid= N-(int)(N*0.8);
        case2= N- (int)(mid*0.22);

        sb.append(case1).append(" ");
        sb.append(case2);

        System.out.println(sb);


    }
}
