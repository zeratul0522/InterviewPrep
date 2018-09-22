package main.java.helper;

import main.java.zutil.TreeNode;

import javax.xml.soap.Node;
import java.util.*;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/9/19 10:47
 * @Desc
 */

public class TreeTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root==null) return ret;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        while (!stack.isEmpty() || curr!=null){
            while(curr!=null){
                stack.push(curr);
                ret.add(curr.val);
                curr = curr.left;

            }
            if(!stack.isEmpty()){
                curr = stack.pop();
                curr = curr.right;
            }

        }
        return ret;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root==null) return ret;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        while (!stack.isEmpty() || curr!=null){
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;

            }
            if(!stack.isEmpty()){
                curr = stack.pop();
                ret.add(curr.val);
                curr = curr.right;
            }

        }
        return ret;
    }

    /*public void postOrder(Node node){
        if(node==null)
            return;
        Stack<Node> s = new Stack<Node>();

        Node curNode; //当前访问的结点
        Node lastVisitNode; //上次访问的结点
        curNode = node;
        lastVisitNode = null;

        //把currentNode移到左子树的最下边
        while(curNode!=null){
            s.push(curNode);
            curNode = curNode.getLchild();
        }
        while(!s.empty()){
            curNode = s.pop();  //弹出栈顶元素
            //一个根节点被访问的前提是：无右子树或右子树已被访问过
            if(curNode.getRchild()!=null&&curNode.getRchild()!=lastVisitNode){
                //根节点再次入栈
                s.push(curNode);
                //进入右子树，且可肯定右子树一定不为空
                curNode = curNode.getRchild();
                while(curNode!=null){
                    //再走到右子树的最左边
                    s.push(curNode);
                    curNode = curNode.getLchild();
                }
            }else{
                //访问
                System.out.println(curNode.getData());
                //修改最近被访问的节点
                lastVisitNode = curNode;
            }
        } //while
    }*/
}
