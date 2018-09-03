package main.java.leetcode;

import java.util.*;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/11 19:46
 * @Desc
 */

public class CloneGraph {
    class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
    }
    Map<Integer,UndirectedGraphNode> visited = new HashMap<Integer,UndirectedGraphNode>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null) return null;
        if(visited.containsKey(node.label)) return visited.get(node.label);

        UndirectedGraphNode myNode = new UndirectedGraphNode(node.label);
        visited.put(myNode.label,myNode);
        List<UndirectedGraphNode> myNeighbors = new ArrayList<>();
        for(UndirectedGraphNode neighbor : node.neighbors){
            myNeighbors.add(cloneGraph(neighbor));
        }
        myNode.neighbors = myNeighbors;
        return myNode;
    }
}
