package baekjoon_java;
import java.util.*;
import java.io.*;

public class baekjoon_2869 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int A= Integer.parseInt(st.nextToken());
        int B= Integer.parseInt(st.nextToken());
        int V= Integer.parseInt(st.nextToken());

        int sum = 0;
        int today = 1;

        while(true) {
            sum+=A;

            if(sum>V) {
                System.out.println(today);
                break;

            }else if(sum<V) {
                sum=sum-B;
                today++;
            }
        }
    }
}
