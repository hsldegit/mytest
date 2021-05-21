package com.leetcode;

import java.util.Arrays;

/**
 * @author huangshilu
 * @date 2021/5/11 15:29
 */
public class l_0004寻找两个正序数组的中位数 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {4};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] nums = new int[length1 + length2];
        int i = 0;
        int j = 0;
        int z = 0;
        if (length1 == 0) {
            nums = nums2;
        } else if (length2 == 0) {
            nums = nums1;
        } else {
            while (z < length1 + length2) {
                if (i > length1 - 1) {
                    nums[z] = nums2[j];
                    j++;
                    z++;
                    continue;
                }
                if (j > length2 - 1) {
                    nums[z] = nums1[i];
                    i++;
                    z++;
                    continue;
                }
                if (nums1[i] < nums2[j]) {
                    nums[z] = nums1[i];
                    i++;
                } else {
                    nums[z] = nums2[j];
                    j++;
                }
                z++;
            }
        }
        if ((length1 + length2) % 2 == 0) {
            return (nums[(length1 + length2) / 2] + nums[(length1 + length2) / 2 - 1]) / 2.0;
        } else {
            return nums[(length1 + length2 - 1) / 2];
        }
    }


}
