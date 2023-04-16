import java.util.*;
import java.io.*;

public class baekjoon_10156 {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int snack = Integer.parseInt(st.nextToken());
        int snack_count = Integer.parseInt(st.nextToken());
        int have_money = Integer.parseInt(st.nextToken());

        int submit_money = snack * snack_count;


        logic(snack, snack_count , have_money , submit_money);




    }
    static void logic(int snack, int snack_count , int have_money , int submit_money) throws IOException {
        if(have_money < submit_money) {
            System.out.println(Math.abs(submit_money - have_money));
        }else {
            System.out.println(0);
        }

    }
}
