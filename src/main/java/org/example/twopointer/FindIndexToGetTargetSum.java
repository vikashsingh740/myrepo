package org.example.twopointer;

public class FindIndexToGetTargetSum {

    public static void twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                // Return 1-based indices
                System.out.println( (left + 1)+" and "+( right + 1) );
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // If no solution is found, you might choose to return an empty array or throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        try {
            twoSum(numbers, target);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
