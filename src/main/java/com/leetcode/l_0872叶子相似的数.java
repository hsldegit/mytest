package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author huangshilu
 * @date 2021/5/10 15:52
 */
public class l_0872叶子相似的数 {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6};
        int[] arr2 = {0, 1, 2, 3, 4, 5, 6};
        TreeNode root1 = buildTreeNode(arr1);
        TreeNode root2 = buildTreeNode(arr2);
        System.out.println(leafSimilar(root1, root2));
    }

    //   0
    // 1    2
    //3 4  5 6

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        if (root1 != null) {
            test1(root1, l1);
        }
        List<Integer> l2 = new ArrayList<>();
        if (root2 != null) {
            test1(root2, l2);
        }
        return l1.equals(l2);
    }

    public static void test1(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.left == null && treeNode.right == null) {
            list.add(treeNode.val);
        }
        test1(treeNode.left, list);
        test1(treeNode.right, list);
    }

    public static TreeNode buildTreeNode(int[] arr) {
        Map<Integer, TreeNode> map = new HashMap<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            TreeNode treeNode = map.get(i);
            if (treeNode == null) {
                treeNode = new TreeNode(arr[i]);
            }
            int leftIndex = 2 * i + 1;
            if (leftIndex < length) {
                TreeNode leftNode = new TreeNode(arr[leftIndex]);
                treeNode.left = leftNode;
                map.put(leftIndex, leftNode);
            }
            int rightIndex = 2 * i + 2;
            if (rightIndex < length) {
                TreeNode rightNode = new TreeNode(arr[rightIndex]);
                treeNode.right = rightNode;
                map.put(rightIndex, rightNode);
            }
            map.put(i, treeNode);
        }
        return map.get(0);
    }

}
