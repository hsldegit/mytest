package com.leetcode;

/**
 * @author huangshilu
 * @date 2021/5/19 19:49
 */
public class l_0021合并两个有序的链表 {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        ListNode listNode1 = ListNode.builderListNode(arr1);
        ListNode listNode2 = ListNode.builderListNode(arr2);
        ListNode listNode = mergeTwoLists(listNode1, listNode2);
        System.out.println(listNode);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
