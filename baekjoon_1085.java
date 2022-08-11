package baekjoon_java;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1085 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int x= Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
       // 161 181 762 375

        //min()함수는 입력받은 두개의 인자중 작은값을 리턴한다. 인자값은 int double long float사용 가능.
        //System.out.println(min(3,12)); >> 작은값인 3을 리턴

        int x_min=Math.min(x,w-x); //x축 최소거리
        int y_min=Math.min(y,h-y); // y축 최소거리

        //x축 y축 최소거리중 가장 작은 값.
        System.out.println(Math.min(x_min,y_min));



    }
}
