package com.example.daily.coding._278;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liurongqi
 * @since 2021/08/17
 */
public class Solution {
    public final static Integer BAD_VERSION = 4;

    Map<Integer, Boolean> checkResult = new HashMap<>();
    public static void main(String[] args) {
        Solution solution = new Solution();
        int badVersion = solution.firstBadVersion(5);
        System.out.println("badVersion = " + badVersion);
    }

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = ((high-low)>>1) + low;
            //第一个错误的版本：isBadVersion(n)=true && isBadVersion(n-1)=false;
            if (isBadVersion(mid)){
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return low;
    }

    private Boolean badVersionCheck(int n){
        Boolean isBadVersion = checkResult.getOrDefault(n, isBadVersion(n));
        checkResult.putIfAbsent(n, isBadVersion);
        return isBadVersion;
    }

    public boolean isBadVersion(int version) {
        System.out.println("---isBadVersion called "+version+"---");
        return version >= BAD_VERSION;
    }
}
