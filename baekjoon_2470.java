package baekjoon_java;

import java.io.*;
import java.util.*;



public class baekjoon_2470 {

    static BufferedReader br;
    static StringTokenizer st;
    static int arr[], list2arr[],  solution_arr1[],solution_arr2[];


    static int N ;
    static StringBuilder sb;

    static ArrayList<Integer>plus_list= new ArrayList<>();
    static ArrayList<Integer>minus_list = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        Input();

    }
    static void Input()throws IOException {

        br =new BufferedReader(new InputStreamReader(System.in));
        N= Integer.parseInt(br.readLine());
        arr =new int [N];

        list2arr = new int [N];
        solution_arr1 = new int[1];
        solution_arr2 = new int[1];


        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(st.nextToken());

            if(arr[i]<0) {
                minus_list.add(i);
            }else {
                plus_list.add(i);
            }
        }
        Collections.sort(minus_list);
        Collections.sort(plus_list);


         if(minus_list.isEmpty()) {
            list2arr[0]= plus_list.get(0);
            list2arr[1]= plus_list.get(1);

            sb.append(list2arr[0]).append(' ');
            sb.append(list2arr[1]).append(' ');
         }
         else if(plus_list.isEmpty()) {
            list2arr[0]=minus_list.get(minus_list.size()-1) ;
             list2arr[0]=minus_list.get(minus_list.size()-2) ;

         }else {


                 if(minus_list.size()>plus_list.size()) {
                     for(int i = 0 ; i < plus_list.size(); i++) {

                         Search(minus_list, plus_list.get(i));
                     }
             }else {
                     for (int i = 0; i < minus_list.size(); i++) {
                         Search(plus_list, minus_list.get(i));
                     }
                 }

         }
         sb = new StringBuilder();
        sb.append(solution_arr1[0]).append(' ');
         sb.append(solution_arr2[0]);
        System.out.println(sb);

    }
    static void Search(ArrayList<Integer>list1 , int X) {

            int length=2000000000;

        for(int i = 0 ; i <list1.size(); i++) {
            if(length>Math.abs(list1.get(i)+ X)) {
                length = Math.abs(list1.get(i)+X);

                solution_arr1[0]=list1.get(i);
                solution_arr2[0]= X;

            }
        }


    }

}
