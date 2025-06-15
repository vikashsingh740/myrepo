package org.general;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray1 {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};  // op: {3,-2,1,-5,2,-4}
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int x : nums) {
            if (x > 0) {
                list1.add(x);
            } else {
                list2.add(x);
            }
        }
        int[] res = new int[nums.length];
        int i = 0;
        while (!list1.isEmpty() && !list2.isEmpty()) {
            res[i++] = list1.remove(0);
            res[i++] = list2.remove(0);
        }
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
