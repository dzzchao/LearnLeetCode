package cn.leetcode.node;

public class Utils {

    static ListNode arrayToListNode(int[] arr) {
        if (arr.length == 0) {
            throw new RuntimeException("the length is 0");
        }
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    static void printListNode(ListNode head) {
        ListNode cur = head;
        StringBuilder sb = new StringBuilder();
        while (cur != null) {
            sb.append(cur.val).append("--->");
            cur = cur.next;
        }
        sb.append("NULL");
        System.out.println(sb);
    }
}
