package org.general;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray2 {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};  // op: {3,-2,1,-5,2,-4}
        int[] res = new int[nums.length];
        int pi = 0;
        int ni = 1;
        for (int x : nums) {
            if (x > 0) {
                res[pi] = x;
                pi += 2;
            }
            if (x < 0) {
                res[ni] = x;
                ni += 2;
            }
        }
        for (int y : res) {
            System.out.print(y + " ");
        }
    }
}
