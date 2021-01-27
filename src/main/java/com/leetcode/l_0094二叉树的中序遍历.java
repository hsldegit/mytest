package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Authror huangshilu
 * @Date 2021/1/25 16:36
 */


public class l_0094二叉树的中序遍历 {


    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

}