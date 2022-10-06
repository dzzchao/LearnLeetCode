package cn.leetcode.node;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
 */
public class LxxCombineNode {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 4};
        int arr2[] = new int[]{2, 3, 5, 6};
        ListNode node = Utils.arrayToListNode(arr);
        ListNode node2 = Utils.arrayToListNode(arr2);
        ListNode resultNode = mergeTwoLists(node, node2);
        Utils.printListNode(resultNode);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //空判断
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = list1 != null ? list1 : list2;
        return dummyHead.next;
    }
}
