package com.leetcode;

/**
 * @Authror huangshilu
 * @Date 2021/1/5 15:45
 */


public class l_0206反转链表 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(node1);
        ListNode listNode = reverseList(node1);
        System.out.println(listNode);

    }

    public static ListNode reverseList(ListNode head) {
        ListNode cur = null;
        ListNode pre = head;
        while (pre != null) {
            ListNode t = pre.next;
            pre.next = cur;
            cur = pre;
            pre = t;
        }
        return cur;
    }
}

