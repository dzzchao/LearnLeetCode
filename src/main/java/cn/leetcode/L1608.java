package cn.leetcode;

import java.util.Arrays;

/*
给你一个非负整数数组 nums 。如果存在一个数 x ，使得 nums 中恰好有 x 个元素 大于或者等于 x ，那么就称 nums 是一个 特殊数组 ，而 x 是该数组的 特征值 。

注意： x 不必 是 nums 的中的元素。

如果数组 nums 是一个 特殊数组 ，请返回它的特征值 x 。否则，返回 -1 。可以证明的是，如果 nums 是特殊数组，那么其特征值 x 是 唯一的 。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/special-array-with-x-elements-greater-than-or-equal-x
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class L1608 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5};
        System.out.println(specialArray(arr));

        int[] nums = new int[]{3, 5, 4, 1, 2, 3};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int specialArray(int[] nums) {
        //1. 找出最大值
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("max = " + max);
        //循环所有符合条件的值
        for (int i = 0; i <= max; i++) {
            int tempNums = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i) {
                    tempNums++;
                }
            }
            if (tempNums == i) {
                return i;
            }
        }
        return -1;
    }
}
