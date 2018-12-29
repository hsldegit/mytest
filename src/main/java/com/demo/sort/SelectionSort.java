package com.demo.sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author huangshilu
 * @date 2018/12/27 16:35
 * @description
 */
public class SelectionSort {


    public static void main(String[] args) {

        int[] arr = {5, 8, 9, 1, 4, 2, 3, 4, 6, 5, 7,};
        sort(arr);
    }


    public static void sort(int[] arr) {

        System.out.println("排序开始-------------arr=" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            //选个最大的出来
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            //第一次循环把最大的放在最后一个 第二次循环放在倒数第二个
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            System.out.println("第" + (i + 1) + "轮选择排序结束结果" + Arrays.toString(arr));
        }
        System.out.println("排序结束------------arr=" + Arrays.toString(arr));

    }

}
