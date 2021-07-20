package com.leetcode;

import java.util.*;

/**
 * @author huangshilu
 * @date 2021/6/28 15:30
 */
public class l_0815公交路线 {
    public static void main(String[] args) {
//        int[][] routes = {{1, 2, 7}, {3, 6, 7}};
//        int source = 2;
//        int target = 7;
//        Map<String,String> map = new HashMap<>();
        Map<String, Object> map = new HashMap<>();
        map.put("appFlag", Boolean.TRUE);
        System.out.println("222:" );
        if (map.get("appFlag") != null && Boolean.TRUE.equals(Boolean.parseBoolean(map.get("appFlag").toString()))) {
            System.out.println("22222222");
        }

        //System.out.println(numBusesToDestination(routes, 2, 6));
    }

    public static int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }
        Map<Integer, List<Integer>> store = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                List<Integer> tmpList;
                if (store.get(routes[i][j]) == null) {
                    tmpList = new ArrayList<>();
                } else {
                    tmpList = store.get(routes[i][j]);
                }
                tmpList.add(i);
                store.put(routes[i][j], tmpList);
            }
        }
        Deque<Integer> deque = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        for (int vehicle : store.get(source)) {
            deque.addLast(vehicle);
            visited.add(vehicle);
        }
        int step = 1;
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                int currentVehicle = deque.removeFirst();
                int[] currentStop = routes[currentVehicle];
                for (int j = 0; j < currentStop.length; j++) {
                    if (currentStop[j] == target) {
                        return step;
                    }
                    for (int vehicle : store.get(currentStop[j])) {
                        if (visited.contains(vehicle)) {
                            continue;
                        }
                        deque.addLast(vehicle);
                        visited.add(vehicle);
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
