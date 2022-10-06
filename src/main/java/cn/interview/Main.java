package cn.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.给定一个整数数组，整数可以是正的，也可以是负的。
 * 你需要找到这两个元素使它们的和最接近于0。eg： {1, 60, -10, 70, -80, 85}
 * <p>
 * <p>
 * 2，在一个二维数组array中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * [
 * [1,2,8,9],
 * [2,4,9,12],
 * [4,7,10,13],
 * [6,8,11,15]
 * ]
 * 给定 target = 7，返回 true。
 * 给定 target = 3，返回 false。
 */
public class Main {
    public static void main(String[] args) {
        int[][] b = new int[][]{};
        // 1.暴力循环 double for ---
        int[] arr = new int[]{1, 60, -10, 70, -80, 85};

        List<Result> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = Math.abs(arr[i] + arr[j]);
                list.add(new Result(i, j, sum));
            }
        }
        System.out.println("resultList" + list);
        sort(list);
        System.out.println("resultList sort" + list);
    }

    private static void sort(List<Result> list) {
        int middle = trueSort(list, 0, list.size() - 1);
        sort(list.subList(0, middle - 1));
        sort(list.subList(middle + 1, list.size()));
    }

    private static int trueSort(List<Result> list, int leftIndex, int rightIndex) {
        int j = 0;
        for (int i = leftIndex; i < rightIndex; i++) {
            if (list.get(i).sum < list.get(leftIndex).sum) {
                j++;
                swap((ArrayList<Result>) list, j, i);
            }
        }
        return j;
    }

    /**
     * 交换 pos
     *
     * @param list
     * @param indexA
     * @param indexB
     */
    private static void swap(ArrayList<Result> list, int indexA, int indexB) {
        Result tempResult = list.get(indexB);
        list.set(indexA, list.get(indexB));
        list.set(indexB, tempResult);
    }


}

class Result {
    int index1 = 0;
    int index2 = 0;
    int sum = 0;

    public Result(int index1, int index2, int sum) {
        this.index1 = index1;
        this.index2 = index2;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Result{" +
                "index1=" + index1 +
                ", index2=" + index2 +
                ", sum=" + sum +
                '}' + "\n";
    }
}