package org.general.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum3 {

    public static void main(String[] args) {
        int k = 3;
        int target = 9;
        List<List<Integer>> res = new ArrayList<>();
        combinationSum(1, res, new ArrayList<>(), target, k);
        System.out.println(res);
    }

    public static void combinationSum(int start, List<List<Integer>> res, List<Integer> temp, int target, int k) {
        if (temp.size() == k && target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if (temp.size() > k || target < 0) {
            return;
        }
        for (int i = start; i <= 9; i++) {
            temp.add(i);
            combinationSum(i + 1, res, temp, target - i, k);
            temp.remove(temp.size() - 1);
        }
    }
}