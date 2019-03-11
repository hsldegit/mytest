package com.data.treeMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author huangshilu
 * @date 2019/2/21 10:15
 * @description
 */
public class Demo1 {


//    public static void main(String[] args) {
//        Map<Integer, String> treeMap = new TreeMap<>((o1, o2) -> {
//            if (o1 < o2) {
//                return 1;
//            }
//            if (o1 > o2) {
//                return -1;
//            }
//            return 0;
//        });
//        treeMap.put(10, "10");
//        treeMap.put(7, "7");
//        treeMap.put(12, "12");
//        treeMap.put(16, "16");
//        treeMap.put(2, "2");
//        treeMap.put(1, "1");
//        treeMap.put(9, "6");
//        treeMap.put(6, "6");
//        treeMap.put(18, "18");
//
//        for (Map.Entry entry : treeMap.entrySet()) {
//            System.out.println("key:" + entry.getKey() + "-value:" + entry.getValue());
//        }
//
//        System.out.println("--------------------------------------------------");
//
//        Map<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(10, "10");
//        hashMap.put(7, "7");
//        hashMap.put(12, "12");
//        hashMap.put(16, "16");
//        hashMap.put(2, "2");
//        hashMap.put(1, "1");
//        hashMap.put(9, "6");
//        hashMap.put(6, "6");
//        hashMap.put(18, "18");
//
//        for (Map.Entry entry :
//                hashMap.entrySet()) {
//            System.out.println("key:" + entry.getKey() + "-value:" + entry.getValue());
//        }
//
//
//    }


    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 3, 4, 5, 6, 8, 9, 9, 10, 12, 17, 17, 17};
        System.out.println(searchIndex(17,arr));
        //synchronized ()
    }

    public static int searchIndex(int key, int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] > key || arr[end] < key) {
            return -1;
        }

        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                while (mid - 1 >= 0 && arr[mid - 1] == key) {
                    mid--;
                }
                return mid;
            }
        }
        return -1;
    }


}
