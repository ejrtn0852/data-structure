package sort.merge;

import java.util.Arrays;

public class MergeToSortedArray {
    public static void main(String[] args) {

        int[] arr1 = {2,4,7,9,11,15};
        int[] arr2 = {1,5,8,14,19,21};

        int[] merge = new int[arr1.length + arr2.length];
        int[] merge1 = merge(arr1, arr2, merge);
        System.out.println(Arrays.toString(merge1));

        System.out.println(arr1.length);

    }

    private static int[] merge(int[] arr1, int[] arr2, int[] merge) {

        int idx1 = 0;
        int idx2 = 0;
        int idxm = 0;


        while (idx1 < arr1.length && idx2 < arr2.length) {

            if (arr1[idx1] < arr2[idx2]) {
                merge[idxm] = arr1[idx1];
                idx1++;
                idxm++;
            } else {
                merge[idxm] = arr2[idx2];
                idx2++;
                idxm++;
            }
        }

        while (idx1 < arr1.length) {
            merge[idxm++] = arr1[idx1++];
        }

        while (idx2 < arr2.length) {
            merge[idxm++] = arr2[idx2++];
        }

        return merge;
    }
}
