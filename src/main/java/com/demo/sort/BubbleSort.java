package com.demo.sort;

import java.util.Arrays;

/**
 * @author huangshilu
 * @date 2018/12/27 16:58
 * @description
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5, 8, 9, 1, 4, 2, 3, 4, 6, 5, 7,};
        sort(arr);
    }

    public static void sort(int[] arr) {
        System.out.println("排序开始-------------arr=" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "轮冒泡排序结束结果" + Arrays.toString(arr));
        }
        System.out.println("排序结束------------arr=" + Arrays.toString(arr));
    }

}
