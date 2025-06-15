package org.general;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> list = solution.grayCode(3);
        System.out.println(list);
    }

    public List<Integer> grayCode(int n) {
        BitSet bits = new BitSet();
        List<Integer> result = new ArrayList<>();
        utils(bits, result, n);
        return result;
    }

    private void utils(BitSet bits, List<Integer> result, int k) {
        if (k == 0) {
            long[] bitArray = bits.toLongArray();
            int decimalValue = bitArray.length > 0 ? (int) bitArray[0] : 0;
            result.add(decimalValue);
        } else {
            utils(bits, result, k - 1);
            bits.flip(k - 1);
            utils(bits, result, k - 1);
        }
    }
}