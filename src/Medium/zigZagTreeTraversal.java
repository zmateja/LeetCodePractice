package Medium;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class zigZagTreeTraversal {
    public static void main(String[] args) {
        TreeNode treeRoot = new TreeNode(1,new TreeNode(2,new TreeNode(4),null), new TreeNode(3,null,new TreeNode(5)));
        zigZagTreeTraversal test = new zigZagTreeTraversal();
        test.zigzagLevelOrder(treeRoot);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<TreeNode> rightToLeft = new LinkedList<>();
        LinkedList<TreeNode> leftToRight = new LinkedList<>();
        List<List<Integer>> parentList = new ArrayList<List<Integer>>();
        int depth = 0;
        if(root == null)
            return parentList;
        leftToRight.add(root);

        while(!leftToRight.isEmpty() || !rightToLeft.isEmpty()){
            ArrayList<Integer> curDepth = new ArrayList<>();
            if(depth % 2 == 0){
                while(!leftToRight.isEmpty()){
                    TreeNode curNode = leftToRight.poll();
                    if(curNode != null){
                        curDepth.add(curNode.val);
                        if(curNode.right != null)
                            rightToLeft.add(curNode.right);
                        if(curNode.left != null)
                            rightToLeft.add(curNode.left);
                    }
                }
                depth++;
            }
            else{
                while(!rightToLeft.isEmpty()){
                    TreeNode curNode = rightToLeft.poll();
                    if(curNode != null){
                        curDepth.add(curNode.val);
                        if(curNode.right != null)
                            leftToRight.add(curNode.right);
                        if(curNode.left != null)
                            leftToRight.add(curNode.left);
                    }
                }
                depth++;
            }
            parentList.add(curDepth);
        }

        return parentList;
    }

}
