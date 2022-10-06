package cn.leetcode;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnx13t/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class L220906 {
    public static void main(String[] args) {
        int a = 1534236469;
        int result = L220906.reverse(a);
        System.out.println(result);
    }

    public static int reverse(int x) {
        int res = 0;
        while(x != 0){
            int i = x % 10;
            res = res * 10 + i;
            x = x / 10;
        }
        return res;
    }

    public static int reverse1(int x) {
        try {
            boolean fu = x < 0;
            x = Math.abs(x);
            String str = x + "";
            char[] tempArr = str.toCharArray();
            for (int i = 0; i < tempArr.length / 2; i++) {
                char temp = tempArr[i];
                tempArr[i] = tempArr[tempArr.length - 1 - i];
                tempArr[tempArr.length - 1 - i] = temp;
            }
            StringBuilder newStr = new StringBuilder();
            for (int i = 0; i < tempArr.length; i++) {
                newStr.append(tempArr[i]);
            }
            int parseInt = Integer.parseInt(newStr.toString());
            if (fu) {
                parseInt = -parseInt;
            }
            return parseInt;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
