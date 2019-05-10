package com.leetcode;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 则中位数是 2.0
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 * @author huangshilu
 * @date 2019/5/5 16:42
 * @description
 */
public class LeetCode0004 {

    public static void main(String[] args) {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int i = m - 1;
        int j = 0;
        if (nums1[i] < nums2[j]) {
        }


        return 0.0;
    }
}
