package sort.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        // 패스가 돌때마다 정렬을하며 정렬을 하는 알고리즘
        int[] arr = {4, 2, 1, 5, 3};

        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int k;
            for (k = i -1; k >= 0 && arr[k] > currentElement; k--) {
                arr[ k + 1] = arr[k];
            }
            arr[k + 1] = currentElement;
            // 24
        }
        System.out.println(Arrays.toString(arr));
    }
}
