package org.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        Arrays.sort(nums);
        Permutation1 permutation1 = new Permutation1();
        List<List<Integer>> result = permutation1.permutation(nums);
        System.out.println(result);
    }

    public List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, result, new ArrayList<>());
        return result;
    }

    public void permute(int[] nums, List<List<Integer>> result, List<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int num : nums) {
            if (temp.contains(num)) {
                continue;
            }
            temp.add(num);
            permute(nums, result, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
