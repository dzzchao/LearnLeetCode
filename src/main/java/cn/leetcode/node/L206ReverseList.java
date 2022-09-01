package cn.leetcode.node;

/**
 * 反转链表
 */
public class L206ReverseList {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        ListNode node = Utils.arrayToListNode(a);
        Utils.printListNode(node);
        ListNode nodeNew = L206ReverseList.reverseList(node);
        Utils.printListNode(nodeNew);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
