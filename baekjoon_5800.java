package baekjoon_java;

import java.util.*;
import java.io.*;

public class baekjoon_5800 {
    static BufferedReader br;
    static StringTokenizer st;
    static int Test_case ;

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        Test_case = Integer.parseInt(br.readLine());

        int count = 1;
        while(Test_case --> 0) {
            st = new StringTokenizer(br.readLine());
            int Class_persons = Integer.parseInt(st.nextToken());

            ArrayList<Integer>class_score = new ArrayList<>();



            for(int i = 0; i < Class_persons; i++) {
                class_score.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(class_score,Collections.reverseOrder());

            int Largest_gap = logic(class_score);

            System.out.println("Class "+count);
            System.out.println("Max "+class_score.get(0)+", Min "+class_score.get(class_score.size()-1)+", Largest gap "+Largest_gap);

            Reset(class_score);
            count++;
        }



    }
    static int logic (ArrayList<Integer>class_score) throws IOException {
        int L = 0 ; int R = 1 ;

        Stack<Integer>stack = new Stack<>();


        while(L<=class_score.size()-2) {
            if(stack.isEmpty()) {
                stack.push(class_score.get(L)- class_score.get(R));
                L++; R++;

            }
            else if(!stack.isEmpty()) {
                if(stack.peek()> class_score.get(L)- class_score.get(R)) {
                    L++; R++;
                    continue;

                }else if(stack.peek()<=class_score.get(L)-class_score.get(R)) {
                    stack.pop();
                    stack.push(class_score.get(L)- class_score.get(R));
                    L++; R++;

                }


            }


        }

        return stack.peek();


    }
    static void Reset(ArrayList<Integer>class_score) {

        while(!class_score.isEmpty()) {
            class_score.remove(0);
        }

    }
}
