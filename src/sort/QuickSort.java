package sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5,7,1,2,9,6,3,4,10,8};

        quickSort(arr,0,arr.length-1);

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));


    }

    public static void quickSort (int[] arr, int left, int right) {

        int pl = left;
        int pr = right;
        int pivot = arr[(pl+pr) /2];
        int temp = 0;

        do {
            while (arr[pl] < pivot) pl++;
            while (arr[pr] > pivot) pr--;

            if (pl <= pr) {
                temp = arr[pl];
                arr[pl] = arr[pr];
                arr[pr] = temp;
                pl++;
                pr--;
            }
        }   while (pl <= pr);

        if (left <= pr) quickSort(arr,left,pr);
        if (pl <= right) quickSort(arr,pl,right);
    }
}
