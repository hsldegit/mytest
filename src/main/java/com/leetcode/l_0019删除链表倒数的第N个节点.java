package com.leetcode;

import java.util.List;

/**
 * @Authror huangshilu
 * @Date 2020/12/30 16:56
 */


public class l_0019删除链表倒数的第N个节点 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        System.out.println(node1);
        ListNode listNode = removeNthFromEnd(node1, 1);
        System.out.println(listNode);
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int p = 0;
        int q = 0;
        ListNode head1 = head;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            p++;
            if (p - q >= n) {
                q++;
            }

        }
        temp = head;
        if (p == n - 1) {
            return head.next;
        }
        p = 0;
        while (temp.next != null) {
            if (p == q - 1) {
                temp.next = temp.next.next;
                break;
            }
            p++;
            temp = temp.next;

        }
        return head;
    }
}



