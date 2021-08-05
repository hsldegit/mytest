package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author huangshilu
 * @date 2021/8/2 16:27
 */
public class l_0056合并区间 {
    public static void main(String[] args) {
        int[][] intervals = {{2, 3}, {2, 2}, {3, 3}, {1, 3}, {5, 7}, {2, 2}, {4, 6}};
        intervals = merge(intervals);
        for (int[] item : intervals) {
            System.out.println(Arrays.toString(item));
        }

    }

    public static int[][] merge(int[][] intervals) {
        int[][] result = {};

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] item = intervals[i];
            if (list.size() == 0) {
                list.add(item);
            }
            boolean add = true;
            for (int[] union : list) {
                if (item[0] <= union[1]) {
                    add = false;
                    if (item[1] < union[1]) {
                    } else {
                        union[1] = item[1];
                    }
                }
            }
            if (add) {
                list.add(item);
            }
        }
        return list.toArray(result);
    }
}
