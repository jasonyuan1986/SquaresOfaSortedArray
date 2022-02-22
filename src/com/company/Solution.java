package com.company;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[p] = nums[i] * nums[i];
                i++;
            } else {
                result[p] = nums[j] * nums[j];
                p--;
            }

        }
        return result;
    }
}
