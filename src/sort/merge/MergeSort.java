package sort.merge;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {7,5,2,4,1,3,8,6};

        mergeSort(arr,arr.length);

    }

    private static void mergeSort(int[] arr, int size) {
        int[] merge = new int[size];

        decomposition(arr,merge,0,size-1);
    }

    private static void decomposition(int[] arr, int[] merge, int left, int right) {
        int mid;

        while(left < right) {
            mid = (left + right) /2;
            decomposition(arr,merge,left,mid); // TODO:  left
            decomposition(arr,merge,mid +1,right); // TODO: right
            combination(arr,merge,left,mid,right); // TODO: merge
        }
    }
    private static void combination(int[] arr, int[] merge, int left, int mid, int right) {

    }
}