package cn.sort;

import java.util.Arrays;
import java.util.Random;

class QuickSort {

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
//        int[] nums = {8, 5, 19, 17, 4};
        int[] nums = {16,8, 32, 7,  25, 3, 19};
        System.out.println(Arrays.toString(nums));
        q.sort(nums, 0, nums.length - 1, new Random());
        System.out.println(Arrays.toString(nums));
    }

    private void sort(int[] nums, int left, int right, Random random) {
        if (left >= right) return;
        int p = partition(nums, left, right, random);
        sort(nums, left, p - 1, random);
        sort(nums, p + 1, right, random);
    }

    private int partition(int[] nums, int left, int right, Random random) {
        int j = left; //从左开始移动
        for (int i = left + 1; i <= right; i++) {
            System.out.println("比较" + nums[i] + "  " + nums[left]);
            if (nums[i] < nums[left]) { //只要当前小于最左边的值
                j++;
                swap(nums, i, j);
                System.out.println("FOR  交换后的 numbs " + Arrays.toString(nums) + i + "交换 = " + j);
            }
        }
        swap(nums, left, j);
        System.out.println("交换后的 numbs " + Arrays.toString(nums));
        System.out.println("" + j +
                "======" +
                "======\n\n");
        return j;
    }

    private void swap(int[] nums, int l, int j) {
        int t = nums[l];
        nums[l] = nums[j];
        nums[j] = t;
    }
}