package com.mapinterface;

import java.util.*;

// Class to find the key with the highest value in a Map<String, Integer>
class MaxKeyFinder {
    public static String findMaxKey(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        String maxKey = findMaxKey(inputMap);
        System.out.println("Key with highest value: " + maxKey);
    }
}
