package org.example.leetcode.array;

public class FindDuplicateAndMissing {

    public static int[] findDuplicateAndMissing(int[] nums) {
        int n = nums.length;
        
        // Calculate expected sums and sum of squares
        long sumExpected = (long) n * (n + 1) / 2;
        long sumSquaresExpected = (long) n * (n + 1) * (2 * n + 1) / 6;
        
        // Calculate actual sums and sum of squares
        long sumActual = 0;
        long sumSquaresActual = 0;
        
        for (int num : nums) {
            sumActual += num;
            sumSquaresActual += (long) num * num;
        }
        
        // Calculate differences
        long diffSum = sumExpected - sumActual; // B - A
        long diffSquares = sumSquaresExpected - sumSquaresActual; // B^2 - A^2
        
        // Compute B + A
        long sumBPlusA = diffSquares / diffSum;
        
        // Solve for A and B
        int A = (int) ((sumBPlusA - diffSum) / 2);
        int B = (int) ((sumBPlusA + diffSum) / 2);
        
        return new int[]{A, B};
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 3};
        int[] result = findDuplicateAndMissing(nums);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}
