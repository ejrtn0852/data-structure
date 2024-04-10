package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,5,2};

        selectionSortV2(arr);






        int s = 0;
        System.out.print("[");
        for (int i : arr) {
            s++;
            if (s < arr.length) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("]");


    }

    public static void selectionSortV1 (int[] arr) {
        int minIndex;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            minIndex = arr[i];
            int checkIndex = arr[i];
            for (int j = i; j < arr.length -1; j++) {
                if (minIndex > arr[j + 1]) {
                    minIndex = arr[j + 1];
                    index = j+1;
                }
            }
            if (checkIndex != minIndex) {
                arr[index] = arr[i];
                arr[i] = minIndex;
                index = 0;
            }
        }
    }


    public static void selectionSortV2 (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
