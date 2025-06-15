package org.general.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        subset(res, new ArrayList<>(), nums,0);
        System.out.println(res);
    }

    public static void subset(List<List<Integer>> res, List<Integer> temp, int[] nums, int indx){
        if(indx == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[indx]);
        subset(res,temp,nums,indx+1);
        temp.remove(temp.size()-1);
        subset(res,temp,nums,indx+1);
    }
}
