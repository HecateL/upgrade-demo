package com.example.daily.coding._704;

import java.util.Arrays;

/**
 * @author liurongqi
 * @since 2021/08/17
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        Solution solution = new Solution();
        int result = solution.search(nums, 13);
        Arrays.binarySearch(nums, 9);
        System.out.println("result = " + result);
    }

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low<=high){
            int mid = low+((high-low)>>1);
            int midVal = nums[mid];

            if (midVal < target){
                low = mid+1;
            } else if (midVal > target){
                high = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
