package org.general;

public class PlusOne {
    public static void main(String[] args) {
        int[] num = {1,9,9};
        int[] a = plusOne(num);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    public static int[] plusOne(int[] nums) {
        // 1 2 3
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] newNumber = new int[nums.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
