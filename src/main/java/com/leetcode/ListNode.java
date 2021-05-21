package com.leetcode;

/**
 * @Authror huangshilu
 * @Date 2021/1/5 15:46
 */


public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        ListNode temp = next;
        sb.append(val);
        while (temp != null) {
            sb.append("->");
            sb.append(temp.val);
            temp = temp.next;
        }
        return sb.toString();
    }

    public static ListNode builderListNode(int[] arr) {
        ListNode listNode = new ListNode(arr[0]);
        setNextNode(arr, 1, listNode);
        return listNode;
    }

    public static void setNextNode(int[] arr, int nextIndex, ListNode listNode) {
        if (nextIndex > arr.length - 1) {
            return;
        }
        ListNode nextNode = new ListNode(arr[nextIndex]);
        listNode.next = nextNode;
        setNextNode(arr, nextIndex + 1, nextNode);
    }

}
