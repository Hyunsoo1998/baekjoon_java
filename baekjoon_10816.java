package baekjoon_java;


import java.util.*;
import java.io.*;
public class baekjoon_10816 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static int arr1[], arr2[];

    public static void main(String[] args) throws IOException {
        Input();
        Output();

    }

    static void Input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        arr1 = new int[N];
        int index = 0;
        while (st.hasMoreTokens()) {
            arr1[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        M = Integer.parseInt(br.readLine());
        arr2 = new int[M];

        st = new StringTokenizer(br.readLine());
        index = 0;
        while (st.hasMoreTokens()) {
            arr2[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));

    }

    static void Output() throws IOException {
        sb = new StringBuilder();
        for(int i =0; i<M; i++) {
            sb.append(upper_bound(arr1,0,arr1.length,arr2[i])-lower_bound(arr1,0,arr1.length,arr2[i])).append(" ");
        }
        System.out.println(sb);

    }

    static int lower_bound(int[] arr, int L, int R, int X) {
        while (L < R) {
            int mid = (L + R) / 2;
            if ( X<=arr[mid])
                R= mid;
            else
                L=mid+1;
        }
        return R;
    }
    static int upper_bound(int[] arr, int L, int R, int X) {
        while (L < R) {
            int mid = (L + R) / 2;
            if (arr[mid]<=X)
                L=mid+1;
            else
                R=mid;
        }
        return R;
    }
}