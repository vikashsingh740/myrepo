package org.general.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        subset(res, new ArrayList<>(), nums, 0);
        System.out.println(res);
    }

    public static void subset(List<List<Integer>> res, List<Integer> temp, int[] nums, int indx) {
        res.add(new ArrayList<>(temp));
        for (int i = indx; i < nums.length; i++) {
            if (i > indx && (nums[i] == nums[i - 1])) {
                continue;
            }
            temp.add(nums[i]);
            subset(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
