import java.util.*;

public class baekjoon10817 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int array[] = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();

        }
        Arrays.sort(array);

        System.out.println(array[1]);


    }
}
