package baekjoon_java;

import java.util.*;
public class Example {
    public static void main(String[] args) {

        int count = 0;
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] mode = new int[10];
        for(int i=0; i<mode.length; i++) {
            mode[arr[i]]++;

        }

        int modeNum = 0; // 최빈수
        int modeCnt = 0; // 최빈수가 출현한 횟수

        for(int i=0; i<10; i++) {
            if (modeCnt < mode[i]) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }
        System.out.println("최빈수 : " + modeNum + "    cnt : " + modeCnt);
        //출처: https://itprogramming119.tistory.com/entry/17-가장-많이-출현한-수를-구하시오-최빈수-구하기 [코딩병원:티스토리]
    }
}
