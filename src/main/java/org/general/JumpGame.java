package org.general;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean b = jumpGame(nums);
        System.out.println(b);
    }

    public static boolean jumpGame(int[] nums) {
        int finalPosition = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if ((i+nums[i]) >= finalPosition) {
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }
}
