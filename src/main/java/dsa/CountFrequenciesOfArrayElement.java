package dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountFrequenciesOfArrayElement {

    static void countFrequencies(int[] array) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int j : array) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> mp:map.entrySet()) {
            System.out.println(mp.getKey()+"--"+mp.getValue());
        }
    }


    public static void main(String[] args) {
        countFrequencies(new int[]{1, 2, 32, 31, 2, 32, 3, 23, 2, 3, 23, 2, 3, 2, 32, 3, 23, 2});
    }
}
