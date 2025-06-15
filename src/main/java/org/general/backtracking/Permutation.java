package org.general.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        int[] nums = {1,2,3};
        permutation(res, new ArrayList<>(), nums);
        System.out.println(res);
    }

    public static void permutation(List<List<Integer>> res, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) {
                continue;
            }
            temp.add(nums[i]);
            permutation(res, temp, nums);
            temp.remove(temp.size()-1);
        }
    }
}
