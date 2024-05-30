package sort.merge;

import java.util.Arrays;

public class SS {
    public static void main(String[] args) {
        int[] arr1 = {2,4,7,9,11,15};
        int[] arr2 = {1,5,8,14,19,21};

        int[] merge = merge(arr1, arr2);

        System.out.println("Arrays.toString(merge) = " + Arrays.toString(merge));



    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length + arr2.length];

        int idx1 = 0;
        int idx2 = 0;
        int idxM = 0;

        while(idx1 < arr1.length && idx2 < arr2.length) {
            if (arr1[idx1] < arr2[idx2]) {
                merge[idxM++] = arr1[idx1++];
            } else {
                merge[idxM++] = arr2[idx2++];
            }
        }

        while (idx1 < arr1.length) {
            merge[idxM++] = arr1[idx1++];
        }

        while (idx2 < arr2.length) {
            merge[idxM++] = arr2[idx2++];
        }





        return merge;


    }
}
