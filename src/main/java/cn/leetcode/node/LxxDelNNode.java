package cn.leetcode.node;

import org.w3c.dom.Node;

import java.util.List;

/**
 * 删除倒数的第N个元素
 */
public class LxxDelNNode {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 5, 1, 9};
        ListNode node = Utils.arrayToListNode(arr);
        ListNode resultNode = removeNthFromEnd(node, 2);
        Utils.printListNode(resultNode);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // 1, 2, 3,
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
