package com.leetcode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author huangshilu
 * @date 2019/5/5 15:13
 * @description
 */
public class LeetCode0002 {


    public static void main(String[] args) {

        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;

        ListNode h1 = new ListNode(5);
        ListNode h2 = new ListNode(6);
        ListNode h3 = new ListNode(4);
        h1.next = null;
        //h2.next = h3;
        System.out.println(addTwoNumbers(l1, h1));

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        ListNode l3 = new ListNode((l1.val + l2.val) % 10);
        if(l1.val + l2.val >= 10){
            l3.next = addTwoNumbers(addTwoNumbers(l1.next, l2.next), new ListNode(1));
        }else{
            l3.next = addTwoNumbers(l1.next, l2.next);
        }
        return l3;
    }



    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;

    }









    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            String s = val + "";
            while (next != null) {
                s = s + "->" + next.val;
                next = next.next;
            }
            return s;
        }
    }


}
