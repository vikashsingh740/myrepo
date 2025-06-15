package org.general.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        combinationSum(candidates, 0, res, new ArrayList<>(), target);
        System.out.println(res);
    }

    public static void combinationSum(int[] candidates, int start, List<List<Integer>> res, List<Integer> temp, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && (candidates[i - 1] == candidates[i])) {
              continue;
            }
            temp.add(candidates[i]);
            combinationSum(candidates, i+1, res, temp, target - candidates[i]);
            temp.remove(temp.size() - 1);
        }
    }
}