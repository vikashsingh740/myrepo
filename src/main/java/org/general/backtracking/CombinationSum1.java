package org.general.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
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
            temp.add(candidates[i]);
            combinationSum(candidates, i, res, temp, target - candidates[i]);
            temp.remove(temp.size() - 1);
        }
    }
}
