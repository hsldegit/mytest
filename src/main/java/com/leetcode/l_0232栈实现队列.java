package com.leetcode;

import java.util.Stack;

/**
 * @Authror huangshilu
 * @Date 2021/3/9 18:19
 */


public class l_0232栈实现队列 {

    public static void main(String[] args) {

    }


}

class MyQueue {

    Stack<Integer> a;

    Stack<Integer> b;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        while (!a.isEmpty()) {
            b.push(a.pop());
        }
        a.push(x);
        while (!b.isEmpty()) {
            a.push(b.pop());
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return a.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return a.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return a.isEmpty();
    }
}