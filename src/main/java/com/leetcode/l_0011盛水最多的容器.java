package com.leetcode;

/**
 * @author huangshilu
 * @date 2021/5/11 16:11
 */
public class l_0011盛水最多的容器 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int area = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            area = Math.max(area, (end - start) * Math.min(height[start], height[end]));
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return area;
    }

}
