package org.general.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation2 {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        int[] nums = {1,1,2};
        Arrays.sort(nums);
        boolean[] b = new boolean[nums.length];
        permutation(res, new ArrayList<>(), nums, b);
        System.out.println(res);
    }
    public static void permutation(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] b) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (b[i] || (i > 0 && nums[i-1]== nums[i] && !b[i-1])){
                continue;
            }
            temp.add(nums[i]);
            b[i] = true;
            permutation(res, temp, nums,b);
            b[i] = false;
            temp.remove(temp.size()-1);
        }
    }
}
