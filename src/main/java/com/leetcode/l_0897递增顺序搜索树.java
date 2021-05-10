package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangshilu
 * @date 2021/4/25 16:17
 */
public class l_0897递增顺序搜索树 {

    public static void main(String[] args) {

    }
    private TreeNode resNode;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummyNode = new TreeNode(-1);
        resNode = dummyNode;
        inorder(root);
        return dummyNode.right;
    }

    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        // 在中序遍历的过程中修改节点指向
        resNode.right = node;
        node.left = null;
        resNode = node;
        inorder(node.right);
    }



}
