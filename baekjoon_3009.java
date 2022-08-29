package baekjoon_java;


import java.util.Scanner;

public class baekjoon_3009 {
    public static void main(String[] args)  {

        int x= 0;
        int y = 0;



    Scanner scan = new Scanner(System.in);

    int arr1[] = {scan.nextInt(), scan.nextInt()};

    int arr2[] = {scan.nextInt(), scan.nextInt() };

    int arr3[] = {scan.nextInt(), scan.nextInt()};

    if(arr1[0] == arr2[0]) {
        x = arr3[0];
    }else if(arr1[0] == arr3[0]) {
        x= arr2[0];

    }else {
        x= arr1[0];

    }
    if(arr1[1]==arr2[1]) {
        y = arr3[1];
    }else if(arr2[1]==arr3[1]) {
        y=arr1[1];
    }else {
        y=arr2[1];
    }
        System.out.println(x+ " "+ y);
    }
}
