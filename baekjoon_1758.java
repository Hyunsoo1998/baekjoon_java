
import java.util.*;
import java.io.*;


public class baekjoon_1758 {
    static BufferedReader br;
    static ArrayList<Integer>Client_input  = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Input();
        logic();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int person = Integer.parseInt(br.readLine());


        for(int i = 0 ; i< person; i ++) {
            Client_input.add(Integer.parseInt(br.readLine()));
        }


    }
    static void logic() throws IOException {

        Collections.sort(Client_input,Collections.reverseOrder());
        long result_sum =0 ;

        ArrayList<Integer>result = new ArrayList<>();

        for(int i = 1; i <=Client_input.size(); i++) {
            if(Client_input.get(i-1)-(i-1)>=0) {
                result.add(Client_input.get(i-1)-(i-1));

            }

        }

        for(int i = 0 ; i < result.size() ; i++) {
            result_sum += result.get(i);
        }

        System.out.println(result_sum);




    }
}
