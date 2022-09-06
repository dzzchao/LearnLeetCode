package cn.sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortTest {
    public static void main(String[] args) {
        BubbleSortTest sort = new BubbleSortTest();
        int[] nums = {16, 8, 32, 7, 25, 3, 19};
        List<Integer> dataList = new ArrayList<Integer>();
        for (int num : nums) {
            dataList.add(num);
        }
        System.out.println("dataList = " + dataList);
        sort.bubbleSort(dataList);
        System.out.println("dataList = " + dataList);

    }

    private void bubbleSort(List<Integer> nums) {
        int len = nums.size();
        for (int i = len - 1; i > 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

}
