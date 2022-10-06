package cn.leetcode.find;

import java.util.Arrays;

class Find {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 4, 8, 9, 2, 4, 7, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //find 5
        int find = 7;
        int left = 0;
        int right = arr.length - 1;
        while (true) {
            int middle = (right - left) / 2 + left;
            if (find == arr[middle]) {
                System.out.println(middle);
                return;
            } else if (find < arr[middle]) {
                right = middle;
            } else {
                left = middle;
            }
        }
    }
}
