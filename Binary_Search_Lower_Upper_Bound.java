package baekjoon_java;

public class Binary_Search_Lower_Upper_Bound {

        static int[] arr = {1, 2, 2, 4, 5, 6};
        static int binarySearch(int[] arr, int L, int R, int X) {
            while (L <= R) {
                int mid = (L + R) / 2;
                if (arr[mid] == X) {
                    return mid;
                } else if (arr[mid] < X) {
                    L = mid + 1;
                } else {
                    R = mid-1;
                }
            }
            return X;
        }
        static int lower_bound(int[] arr, int L, int R, int X) {
            while (L < R) {
                int mid = (L + R) / 2;
                if (arr[mid] >= X) R = mid;
                else L = mid + 1;
            }
            return L;
        }
        static int upper_bound(int[] arr, int L, int R, int X) {
            while (L < R) {
                int mid = (L + R) / 2;
                if (arr[mid] > X) R = mid; // X 이상이 아닌 초과의 수 'X 보다 큰 수'
                else L = mid + 1;
            }
            return L;
        }
        public static void main(String[] args) {
            System.out.println(binarySearch(arr, 0, arr.length - 1, 4)); // 3번 인덱스 return
            // LowerBound , UpperBound를 같은 파라미터로 Lower -> Upper || Upper -> Lower 로 변경해서 실행해보세요
            System.out.println(upper_bound(arr, 0, arr.length - 1, 10)); // 10이 추가되어도 오름차순이 변경되지 않는 가장 오른쪽 위치
            System.out.println(lower_bound(arr, 0, arr.length - 1, 2)); // 2가 추가되어도 오름차순이 변경되지 않는 가장 왼쪽 위치
        }
    }

