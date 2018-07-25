package com.respam.ds;

/**
 * Created by S P Mahapatra on 25/07/2018.
 */
public class TreeNode {
    int data;
    TreeNode left, right;

    // Creates an empty tree node
    public TreeNode(){
        data = Integer.MIN_VALUE;
        left = right = null;
    }

    public TreeNode(int data){
        this.data = data;
        left = right = null;
    }


}
