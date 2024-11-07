package br.com.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/

public class IntersectionTwoArraysIICopilot {
	
    public static int[] intersect(int[] nums1, int[] nums2) {
        // Mapa para contar as ocorrências dos elementos em nums1
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Lista para armazenar a interseção
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                intersection.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        // Converter a lista de interseção para um array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersect(nums1, nums2);

        // Imprimir o resultado
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
