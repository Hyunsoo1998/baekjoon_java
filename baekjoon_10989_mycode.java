package baekjoon_java;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class baekjoon_10989_mycode {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st =  new StringTokenizer(br.readLine(),"");

            int N = Integer.parseInt(st.nextToken());


            ArrayList<Integer> list = new ArrayList<Integer>();

            for(int i = 0 ; i<N; i ++) {
                st=new StringTokenizer(br.readLine());


                list.add(Integer.parseInt(st.nextToken()));

            }
            Collections.sort(list);

            System.out.println(list);
        }
    }



