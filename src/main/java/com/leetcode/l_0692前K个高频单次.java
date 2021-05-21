package com.leetcode;

import java.util.*;

/**
 * @author huangshilu
 * @date 2021/5/21 17:19
 */
public class l_0692前K个高频单次 {
    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        System.out.println(topKFrequent(words, 4));
    }

    public static List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        Collections.sort(list, new Comparator<String>() {
            public int compare(String word1, String word2) {
                return map.get(word1) == map.get(word2) ? word1.compareTo(word2) : map.get(word2) - map.get(word1);
            }
        });
        return list.subList(0, k);
    }


}
