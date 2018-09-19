package main.java.algorithm;

        import main.java.util.Print;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

/**
 * @author Fan Zejun E-mail:fzj0522@outlook.com
 * @version Created at：2018/8/25 10:42
 * @Desc
 */

public class KnowledgeParty {
    public int getGroupNumber(int n, List<List<Integer>> knowledge){
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                count++;
                visit(i,knowledge,visited,n);
            }
        }
        return count;
    }
    public void visit(int i, List<List<Integer>> knowledge, boolean[] visited, int n){
        visited[i] = true;
        for(int j = 0; j < n; j++){
            if(!visited[j] && (knowledge.get(i).contains(j) || knowledge.get(j).contains(i))){
                visit(j,knowledge,visited,n);
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        List<List<Integer>> knowledge = new ArrayList<>();
        Integer[] array1 = {};
        List<Integer> list1 = Arrays.asList(array1);
        Integer[] array2 = {4,2};
        List<Integer> list2 = Arrays.asList(array2);
        Integer[] array3 = {7,3};
        List<Integer> list3 = Arrays.asList(array3);
        Integer[] array4 = {8};
        List<Integer> list4 = Arrays.asList(array4);
        Integer[] array5 = {8};
        List<Integer> list5 = Arrays.asList(array5);
        Integer[] array6 = {2};
        List<Integer> list6 = Arrays.asList(array6);
        Integer[] array7 = {};
        List<Integer> list7 = Arrays.asList(array7);
        Integer[] array8 = {6,8};
        List<Integer> list8 = Arrays.asList(array8);
        Integer[] array9 = {};
        List<Integer> list9 = Arrays.asList(array9);
        Integer[] array10 = {8,6};
        List<Integer> list10 = Arrays.asList(array10);
        knowledge.add(list1);
        knowledge.add(list2);
        knowledge.add(list3);
        knowledge.add(list4);
        knowledge.add(list5);
        knowledge.add(list6);
        knowledge.add(list7);
        knowledge.add(list8);
        knowledge.add(list9);
        knowledge.add(list10);
        //Print.printListList(knowledge);
        System.out.println(knowledge.get(0).contains(4));
        KnowledgeParty knowledgeParty = new KnowledgeParty();
        System.out.println(knowledgeParty.getGroupNumber(n,knowledge));

    }

}
