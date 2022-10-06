package cn.leetcode;

import kotlin.text.UStringsKt;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 */
public class L220906_1 {
    public static void main(String[] args) {
        String str = "leetcode";
        int result = L220906_1.firstUniqChar(str);
        System.out.println(result);
        int z = 0;
//        int tm = z++;
        System.out.println(z++);
    }

    private static int firstUniqChar(String str) {
        int count[] = new int[26];
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(count[arr[i] - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}