package br.com.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortPeople2418 {

	public static void main(String[] args) {
		sortPeople(new String[] { "Mary","John","Emma" }, new int[] { 180,165,170  });
	}

	public static String[] sortPeople(String[] names, int[] heights) {
		
		HashMap<Integer, String> map = new HashMap<>();
		for(int i =0; i < names.length; i++) {
			map.put(heights[i], names[i]);
		}
		
		List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		Collections.reverse(entries);
		List<String> orderedName= new ArrayList<>();
		for (Map.Entry<Integer, String> entry : entries) {
			orderedName.add(entry.getValue());
	    }
		return orderedName.toArray(new String[0]);
	}

}
