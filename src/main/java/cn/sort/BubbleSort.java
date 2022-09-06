package cn.sort;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] nums = {16, 8, 32, 7, 25, 3, 19};
        sort.bubbleSort(nums);
        for (int num : nums) {
            System.out.print(num + " -> ");
        }
    }

    private void bubbleSort(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i > 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

}
