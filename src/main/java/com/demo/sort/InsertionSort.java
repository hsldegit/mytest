package com.demo.sort;

import java.util.Arrays;

/**
 * @author huangshilu
 * @date 2018/12/27 17:03
 * @description
 */
public class InsertionSort {


    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 6, 4};
        sort(arr);
    }


    public static void sort(int[] arr) {

        System.out.println("排序开始-------------arr=" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i + 1];
            int leftIndex = i;
            System.out.println("leftIndex-start:" + leftIndex);
            while (leftIndex >= 0 && arr[leftIndex] > temp) {
                arr[leftIndex + 1] = arr[leftIndex];
                leftIndex--;
            }
            System.out.println("temp:" + temp + "-----leftIndex-end:" + leftIndex);
            arr[leftIndex + 1] = temp;
            System.out.println("第" + (i + 1) + "轮插入排序结束结果" + Arrays.toString(arr));

        }
        System.out.println("排序结束------------arr=" + Arrays.toString(arr));

    }
}
