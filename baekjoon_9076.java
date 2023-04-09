import java.util.*;
import java.io.*;
public class baekjoon_9076 {
    static BufferedReader br;
    static StringTokenizer st;
    static int Test_case;

    static ArrayList<Integer>list;

    public static void main(String[] args) throws IOException  {

        Input();

    }
    static void Input() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            Test_case =Integer.parseInt(br.readLine());


            while(Test_case -->0) {
                list = new ArrayList<>();
                int sum = 0 ;

                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < 5; i++) {
                    list.add(Integer.parseInt(st.nextToken()));
                }
                Collections.sort(list);
                list.remove(0);
                list.remove(list.size()-1);

                if((list.get(list.size()-1)-(list.get(0)) > 3))  {
                    System.out.println("KIN");

                }else {
                    for(int i = 0 ; i < list.size(); i ++) {
                        sum += list.get(i);
                    }

                    System.out.println(sum);


                }
                    logic(list);
            }

    }
    static void logic(ArrayList<Integer>list) throws IOException {
            while(!list.isEmpty()) {
                list.remove(0);
            }

    }
}
