package baekjoon_java;

import java.util.*;
import java.io.*;


public class baekjoon_10814 {
    static int N ;
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static GG arr[];
    static class GG  {
        int age;
        String name;

        public GG(int age, String name ) {
            this.age = age;
            this.name = name;

        }
        @Override
        public String toString() {

            return age +" " +name + '\n';
        }

    }

    static ArrayList<Integer>list;
    public static void main(String[] args) throws IOException{
        Input();
        Output();

    }
    static void Input()throws IOException {
        br= new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());

        arr= new GG[N]; //GG타입의 객체배열 생성..
        for(int i = 0 ; i< N ; i++) {
            st = new StringTokenizer(br.readLine());

            int age= Integer.parseInt(st.nextToken());
            String name =st.nextToken();

            arr[i]=new GG(age,name); // GG타입의 배열에다가 값을 생성자 호출해서 나온 값으로 받아준다.

        }
        //타입를 GG타입으로 두기 ..


        //new Comparator<GG>() <- 표현법 찾아보기 이것도 익명 클래스의 관한것..

        Arrays.sort(arr,new Comparator<GG>() {
            @Override
                    public int compare(GG s1, GG s2) {

                return s1.age- s2.age;
            }

        });

    }
    static void Output()throws IOException {
        sb= new StringBuilder();

        for(int i= 0; i <N; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb);

    }

}
