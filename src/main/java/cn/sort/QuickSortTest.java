package cn.sort;

import java.util.Arrays;
import java.util.Random;

class QuickSortTest {

    public static void main(String[] args) {
        QuickSortTest q = new QuickSortTest();
        int[] nums = {8, 32, 7, 16, 25, 3, 19};
        System.out.println(Arrays.toString(nums));
        q.sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private void sort(int[] nums, int left, int right) {
        if (left >= right) return;
        int p = partition(nums, left, right);
        sort(nums, left, p - 1);
        sort(nums, p + 1, right);
    }

    private int partition(int[] nums, int left, int right) {
        int j = 0;
        for (int i = left + 1; i <= right; i++) {
            if (nums[left] > nums[i]) {
                j++;
                swap(nums, j, i);
            }
        }
        swap(nums, left, j);
        return j;
    }

    void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}