package cn.leetcode.node;

/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false
 */
public class LxxisPalindrome {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 4};
        ListNode node = Utils.arrayToListNode(arr);
        boolean resultNode = isPalindrome(node);
        System.out.println(resultNode);
    }

    public static boolean isPalindrome(ListNode head) {
        //1 通过快慢双指针，找到中间
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            //奇数,所以slow要再往后走一个
            slow = slow.next;
        }
        //2. 注意奇数，反转后面的列表
        slow = reverse(slow);
        fast = head;
        //3. 然后比较两个链表的值是否一样
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    private static ListNode reverse(ListNode head) {
        //1,2,3,4
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
