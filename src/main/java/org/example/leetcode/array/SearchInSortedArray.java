package org.example.leetcode.array;

class SearchInSortedArray {
    public static int search(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] >= a[start]) {
                if (target <= a[mid] && target >= a[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target >= a[mid] && target <= a[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2};
        int x = search(a,0);
        System.out.print(x);
    }
}