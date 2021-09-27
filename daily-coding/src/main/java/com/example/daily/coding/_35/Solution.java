package com.example.daily.coding._35;

/**
 * @author liurongqi
 * @since 2021/08/17
 */
public class Solution {

    public static void main(String[] args) {
        String bool = String.valueOf(Boolean.TRUE);
        System.out.println("String.valueOf(Boolean.TRUE) = " + bool);

        Boolean value = Boolean.valueOf(bool);
        System.out.println("Boolean.valueOf(bool) = " + value);
    }

    public int searchInsert(int[] nums, int target) {
        //返回它会被按顺序插入的位置
        int low = 0;
        int high = nums.length-1;
        while (low <= high){
            int mid = low+((high-low)>>1);
            if (nums[mid] < target){
                low = mid+1;
            } else if (nums[mid] > target){
                high = mid-1;
            } else {
                return mid;
            }
        }
        return low;
    }
}
