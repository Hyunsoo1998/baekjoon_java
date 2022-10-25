package baekjoon_java;

import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;


public class baekjoon_10867 {
    static BufferedReader br;
    static StringTokenizer st ;

    static TreeSet<Integer>t_set = new TreeSet<>();
    static HashSet<Integer>h_set = new HashSet<>();
    static StringBuilder sb;
    static int N ;

    public static void main(String[] args) throws IOException {

        Input();

    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {

            h_set.add(Integer.parseInt(st.nextToken()));

        }

        t_set.addAll(h_set);
//        System.out.println(t_set);

        while(t_set.size()!=0) {
            sb.append(t_set.pollFirst()).append(' ');
        }

        System.out.println(sb);



    }


    }

