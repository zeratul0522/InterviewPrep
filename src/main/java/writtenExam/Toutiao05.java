package main.java.writtenExam;


import java.util.*;

public class Toutiao05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashMap<Integer, Node> map = new HashMap<>();
        for (int i=0; i<M; i++){
            int start =  sc.nextInt();
            int end = sc.nextInt();
            Node n1 = map.get(start), n2 = map.get(end);
            if (n1 == null){
                n1 = new Node(start);
                map.put(start, n1);
            }
            if (n2 == null){
                n2 = new Node(end);
                map.put(end, n2);
            }
            n2.addNext(n1);
        }
        Collection<Node> nodes = map.values();
        HashSet<Node> noNeed = new HashSet<>();
        for (Node n : nodes){
            if (!noNeed.contains(n)){
                visit(n);
                noNeed.add(n);
                noNeed.addAll(n.set);
            }
        }
        int res = 0;
        for (Node n : nodes){
            if (n.getSize() >= N-1)
                res++;
        }
        System.out.println(res);
    }

    public static void visit(Node node){
        boolean retry = true;
        while (retry){
            retry = false;
            LinkedList<Node> list = new LinkedList<>();
            list.add(node);
            HashSet<Node> visited = new HashSet<>();
            while (!list.isEmpty()){
                Node cur = list.poll();
                visited.add(cur);
                for (Node n : cur.nexts){
                    if (node.add(n.set))
                        retry = true;
                    if (!visited.contains(n)){
                        visited.add(n);
                        list.add(n);
                    }
                }
            }
        }
    }
}



class Node{
    int val;
    HashSet<Node> set = new HashSet<>();
    List<Node> nexts = new LinkedList<>();
    Node(int val){
        this.val = val;
    }
    public void addNext(Node node){
        nexts.add(node);
        set.add(node);
    }
    public boolean add(Collection node){
        int s = set.size();
        set.addAll(node);
        if (s < set.size())
            return true;
        else
            return false;
    }

    public int getSize(){
        set.remove(this);
        return set.size();
    }

}
