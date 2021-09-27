package com.example.daily.coding._100;

import com.example.daily.coding.base.TreeNode;

/**
 * @author liurongqi
 * @since 2021/08/11
 */
public class Solution {

    /**
     * 相同的树：结构上相同，节点上具有相同的值
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        } else if (p == null || q == null){
            return false;
        } else if (p.val != q.val){
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

}
