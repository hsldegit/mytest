package com.demo.sort;

import java.util.Arrays;

/**
 * @author huangshilu
 * @date 2019/2/18 16:37
 * @description
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        System.out.println("构建大顶堆--------------------");
        System.out.println(Arrays.toString(arr));
        //1.构建大顶堆 -i = 2 i=1 i=0
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr, i, arr.length);
        }
        System.out.println("--------------------");
        //结果
        //    3
        //  5    6
        //4  2  1  7

        //j = 6 5 4 3 2 1
        //2.调整堆结构+交换堆顶元素与末尾元素
        //第一次吧最大的放到最后一个  然后上浮 第二次把最大的放到倒数第二个  然后上浮 第三个放倒数第三个 然后上浮 ----
        for (int j = arr.length - 1; j > 0; j--) {
            swap(arr, 0, j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr, 0, j);//重新对堆进行调整
        }

    }






    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     *
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];//先取出当前元素i
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {//从i结点的左子结点开始，也就是2i+1处开始
            if (k + 1 < length && arr[k] < arr[k + 1]) {//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if (arr[k] > temp) {//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 交换元素
     *
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
