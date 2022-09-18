package baekjoon_java;


import java.util.*;
import java.io.*;

public class baekjoon_10816 {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int arr1[], arr2[], arr3[];

    static int N , M;

    public static void main(String[]args) throws IOException{

        Input();
        Output();

    }
    static int BinarySearch(int[]arr, int L , int R , int X ) {

        while(L<R) {
            int mid = (L+R)/2;

            if(arr[mid]==X) {
                return arr[mid];
            }
            else if(arr[mid]<X) {
                L=mid+1;
            }
            else{
                R=mid;
            }
        }
        return 0;
    }
    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N= Integer.parseInt(br.readLine());
        arr1=new int[N];
        int index = 0;

        st= new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            arr1[index]=Integer.parseInt(st.nextToken());
            index++;
        }
        M=Integer.parseInt(br.readLine());
        arr2= new int[M];
        index = 0 ;

        st=new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            arr2[index]=Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
    }
    static void Output() throws IOException {
        sb = new StringBuilder();
        for(int i = 0 ; i < M; i++) {
        BinarySearch(arr1, 0,arr1.length , arr2[i]);

                if(BinarySearch(arr1,0,arr1.length-1,arr2[i])==arr2[i])
                    arr3[i]=arr2[i];
                else if(BinarySearch(arr1,0,arr1.length-1,arr2[i])!=arr2[i])
                    arr3[i]=0;
        }
        Arrays.sort(arr3);

        }
        }

