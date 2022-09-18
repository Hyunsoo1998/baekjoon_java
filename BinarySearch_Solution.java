package baekjoon_java;
import java.util.*;
import java.io.*;

public class BinarySearch_Solution {
    static StringBuilder sb;
    static int BinarySearch(int arr[], int L, int R, int X) {

        while (L < R) {
            int mid = (L + R) / 2;

            if (arr[mid] == X)
                return 1;
            else if (arr[mid] < X) {
                L = mid + 1;
            } else {
                R = mid;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            arr1[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        index = 0;

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            arr2[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr1);
        for (int i = 0; i < arr2.length; i++) {
            sb.append(BinarySearch(arr1, 0, arr1.length -1 , arr2[i])).append('\n');
        }

        System.out.print(sb);
    }
}