package baekjoon_java;

import java.util.*;
import java.io.*;
public class baekjoon_10815 {
    static int arr1[],arr2[];
    static int N,M;
    static BufferedReader br ;
    static StringTokenizer st ;
    static StringBuilder sb;


    public static void main(String[]args) throws IOException{
        Input();
        Output();
    }
    static void Input() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));

        N= Integer.parseInt(br.readLine());
        arr1= new int [N];
        int index =0;

        st= new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            arr1[index]=Integer.parseInt(st.nextToken());
            index++;
        }
        M=Integer.parseInt(br.readLine());
        arr2 = new int[M];

        index =0 ;
        st= new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            arr2[index]=Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

    }
    static void Output() throws IOException {
        sb= new StringBuilder();
        for(int i = 0; i < M; i++) {
            sb.append(BinarySearch(arr1,0,arr1.length-1,arr2[i])).append(" ");
        }
        System.out.println(sb);

    }
    static int BinarySearch(int []arr, int L , int R, int X) {

        while(L<=R) {
            int mid = (L+R)/2;
            if(arr[mid]==X)
                return 1;
            else if(arr1[mid]<X) {
                L=mid+1;
            }else {
                R=mid-1;
            } //12345

        }
        return 0;

    }


}
