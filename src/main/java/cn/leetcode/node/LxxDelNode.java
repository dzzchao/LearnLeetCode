package cn.leetcode.node;

import java.util.Arrays;

public class LxxDelNode {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 5, 1, 9};
        ListNode node = Utils.arrayToListNode(arr);
        deleteNode(node);
        Utils.printListNode(node);
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
