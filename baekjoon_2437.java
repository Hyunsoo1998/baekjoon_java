
import java.util.*;
import java.io.*;

public class baekjoon_2437 {
    static BufferedReader br;
    static StringTokenizer st;

    static int Object_count ;
    static ArrayList<Integer>Client_input =  new ArrayList<>();


    public static void main(String[] args) throws IOException {

        Input();
        logic();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        Object_count = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < Object_count ; i ++) {
            Client_input.add(Integer.parseInt(st.nextToken()));

        }
        Collections.sort(Client_input);


    }
    static void logic()  {

        int sum = 0 ;
        for(int i = 0 ; i<Object_count; i++ ) {
            if(sum+1 < Client_input.get(i)) {
                 break;
            }
            sum+= Client_input.get(i);

        }

        System.out.println(sum+1);


    }
}
